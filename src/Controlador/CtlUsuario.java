/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dao.DaoGenerico;
import Modelo.ClsCliente;
import Modelo.Usuario;
import com.google.gson.Gson;

/**
 *
 * @author Lizeth1304
 */
public class CtlUsuario {
    
    String tabla = "usuarios";

    public CtlUsuario() {
    }

    public String convertirGson(Usuario us) {
        Gson gson = new Gson();
        String objeto = gson.toJson(us);
        return objeto;
    }

    public Usuario login(String user, String pass){
        String consulta ="select * from " + tabla+ "where nombre='" + user + "' and contrasena'"+pass+"'";
        DaoGenerico usuarioDAO = new DaoGenerico();
        String res = usuarioDAO.login(consulta);
        Gson json = new Gson();
        Usuario usu = json.fromJson(res, Usuario.class);
        return usu;
    }
    
    public boolean guardar(Usuario usuario){
        DaoGenerico dao = new DaoGenerico();
        String objeto = convertirGson(usuario);
        return dao.guardar(objeto,tabla);
    }
    public ClsCliente SolicitudBuscar(int cedulaU) {
        DaoGenerico usuarioDAO = new DaoGenerico();
        String res = usuarioDAO.buscar(tabla, "cedula", String.valueOf(cedulaU));
        Gson json = new Gson();
        ClsCliente mar = json.fromJson(res, ClsCliente.class);
        return mar;
    }

    

}
