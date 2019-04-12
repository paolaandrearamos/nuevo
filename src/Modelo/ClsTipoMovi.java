/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author paola
 */
public class ClsTipoMovi {
  int  idTipo_Movimiento;
 String Descripcion;

    public ClsTipoMovi(int idTipo_Movimiento, String Descripcion) {
        this.idTipo_Movimiento = idTipo_Movimiento;
        this.Descripcion = Descripcion;
    }

    public int getIdTipo_Movimiento() {
        return idTipo_Movimiento;
    }

    public void setIdTipo_Movimiento(int idTipo_Movimiento) {
        this.idTipo_Movimiento = idTipo_Movimiento;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
}
