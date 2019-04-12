/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dao.DaoGenerico;
import Modelo.ClsBanco;
import Modelo.ClsTipoMovi;
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
public class CtlTipoMovi {
     String tabla = "Tipo_Movimiento";

    public CtlTipoMovi() {
    }
     public String convertirGson(ClsTipoMovi tipoMovi) {
        Gson gson = new Gson();
        String objeto = gson.toJson(tipoMovi);
        return objeto;
    }

    public boolean guardar(ClsTipoMovi tipoMovi) {
        DaoGenerico dao = new DaoGenerico();
        String objeto = convertirGson(tipoMovi);
        return dao.guardar(objeto, tabla);
    }

  

    public ArrayList<ClsTipoMovi> listar() {
        DaoGenerico dao = new DaoGenerico();
        String res = dao.listarTodo(tabla);
        Gson json = new Gson();
        Type tipo = new TypeToken<ArrayList<ClsTipoMovi>>() {
        }.getType();
        ArrayList<ClsTipoMovi> tipoMovi = json.fromJson(res, tipo);
        return tipoMovi;
    }
     public DefaultTableModel listarTipoMovi(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<ClsTipoMovi> tipomovi = listar();
        for (ClsTipoMovi tipoMovi : tipomovi) {
            model.addRow(new Object[]{
                tipoMovi.getIdTipo_Movimiento(),
                tipoMovi.getDescripcion(),
                
                    
               
            });
        }
        return model;
    }
}
