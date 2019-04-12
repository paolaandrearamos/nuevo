/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dao.DaoGenerico;
import Modelo.ClsCargo;
import Modelo.ClsCuentaMovi;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paola
 */
public class CtlCuentaMovi {
      String tabla = "cuenta";

    public CtlCuentaMovi() {
    }
     public String convertirGson(ClsCuentaMovi cuentamovi) {
        Gson gson = new Gson();
        String objeto = gson.toJson(cuentamovi);
        return objeto;
    }

    public boolean guardar(ClsCuentaMovi cuentamovi) {
        DaoGenerico dao = new DaoGenerico();
        String objeto = convertirGson(cuentamovi);
        return dao.guardar(objeto, tabla);
    }
  
 
    
public ArrayList<ClsCuentaMovi> listar() {
        DaoGenerico dao = new DaoGenerico();
        String res = dao.listarTodo(tabla);
        Gson json = new Gson();
        Type tipo = new TypeToken<ArrayList<ClsCuentaMovi>>() {
        }.getType();
        ArrayList<ClsCuentaMovi> cuentamovi = json.fromJson(res, tipo);
        return cuentamovi;
    }

   public DefaultTableModel listarcuentamovi(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<ClsCuentaMovi> cuentamovi = listar();
        for (ClsCuentaMovi cuentaM : cuentamovi) {
            model.addRow(new Object[]{
                cuentaM.getIdCuenta(),
                cuentaM.getDescripcion(),
               cuentaM.getBanco_idBanco(),
               cuentaM.getSucursal_idSucursal(),
               cuentaM.getTipo_cuenta_idTipo_cuenta(),
               cuentaM.getPassword(),
               cuentaM.getSaldo()
                
                 
                    
               
            });
        }
        return model;
    }
    public ClsCuentaMovi SolicitudBuscarCuentaCliente(int cedula) {
        
        DaoGenerico usuarioDAO = new DaoGenerico();
        //se consume el servicio
        String res = usuarioDAO.buscar(tabla, "Persona_cedula", String.valueOf(cedula));
        //Creamos el Gson
        Gson json = new Gson();
        //Convertimos la respuesta enviada desde el dao genérico y le decimos en clase lo queremos convertir
        //Primer valor es el json string que retornamos
        //Segundo valor es la clase en la que quieres convertir la cadena json
        //Es muy importante que los atributos de la ClUsuaio tengan el mismo nombre
        //que las  columnas de las tablas de la base de datos
        ClsCuentaMovi usu = json.fromJson(res, ClsCuentaMovi.class);
        return usu;
    }
     public ClsCuentaMovi SolicitudBuscar(int Cuenta_idCuenta) {
        
        DaoGenerico usuarioDAO = new DaoGenerico();
        //se consume el servicio
        String res = usuarioDAO.buscar(tabla, "idCuenta", String.valueOf(Cuenta_idCuenta));
        //Creamos el Gson
        Gson json = new Gson();
        //Convertimos la respuesta enviada desde el dao genérico y le decimos en clase lo queremos convertir
        //Primer valor es el json string que retornamos
        //Segundo valor es la clase en la que quieres convertir la cadena json
        //Es muy importante que los atributos de la ClUsuaio tengan el mismo nombre
        //que las  columnas de las tablas de la base de datos
        ClsCuentaMovi usu = json.fromJson(res, ClsCuentaMovi.class);
        return usu;
    }
}
