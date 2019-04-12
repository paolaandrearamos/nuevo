/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dao.DaoGenerico;
import Modelo.ClsCliente;
import Modelo.ClsCliente2;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author Lizeth1304
 */
public class CtlCliente2 {
     public static String tabla = "Persona";

    public CtlCliente2() {
    }
     public String convertirGson(ClsCliente2 cliente) {
        Gson gson = new Gson();
        String objeto = gson.toJson(cliente);
        return objeto;
    }

    public boolean guardar(ClsCliente2 cliente) {
        DaoGenerico dao = new DaoGenerico();
        String objeto = convertirGson(cliente);
        return dao.guardar(objeto, tabla);
    }
    
     public ArrayList<ClsCliente2> listar() {
        DaoGenerico dao = new DaoGenerico();
        String res = dao.listarTodo(tabla);
        String respuesta = res.substring(0, res.length() - 2) + "}]";
         System.out.println("Test these lines");
         System.out.println(respuesta);
        Gson json = new Gson();
        Type tipo = new TypeToken<ArrayList<ClsCliente2>>() {
        }.getType();
        ArrayList<ClsCliente2> clsCliente2 = json.fromJson(respuesta, tipo);
        return clsCliente2;
    }
          
     public ClsCliente2 SolicitudBuscar(int cedula) {
        
        DaoGenerico usuarioDAO = new DaoGenerico();
        //se consume el servicio
        String res = usuarioDAO.buscar(tabla, "cedula", String.valueOf(cedula));
        //Creamos el Gson
        Gson json = new Gson();
        //Convertimos la respuesta enviada desde el dao genérico y le decimos en clase lo queremos convertir
        //Primer valor es el json string que retornamos
        //Segundo valor es la clase en la que quieres convertir la cadena json
        //Es muy importante que los atributos de la ClUsuaio tengan el mismo nombre
        //que las  columnas de las tablas de la base de datos
        ClsCliente2 usu = json.fromJson(res, ClsCliente2.class);
        return usu;
    }
}
