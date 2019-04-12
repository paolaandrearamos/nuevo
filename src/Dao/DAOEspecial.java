/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.TipoCuentaCosto;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author paola
 */
public class DAOEspecial extends Conexion {

    public DAOEspecial() {
    }

    public ArrayList<TipoCuentaCosto> listar(int id) {
        ArrayList<TipoCuentaCosto> lista = new ArrayList<>();
        String consulta = "select costo.monto,tipo_cuenta.descripcion from"
                + " costo join cuenta_costo on costo.idCosto=cuenta_costo.Costo_idCosto "
                + " join tipo_cuenta on cuenta_costo.Tipo_cuenta_idTipo_cuenta=tipo_cuenta.idTipo_cuenta"
                + " where tipo_cuenta.idTipo_cuenta =" + id;
        super.ejecutarRetorno(consulta);
        try {
            while (resultadoDB.next()) {
                TipoCuentaCosto tipo = new TipoCuentaCosto();
                tipo.setMonto(resultadoDB.getDouble("costo.monto"));
                tipo.setDescripcion(resultadoDB.getString("tipo_cuenta.descripcion"));
                lista.add(tipo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

}
