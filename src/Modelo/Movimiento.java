/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Lizeth1304
 */
public class Movimiento {
    int idMovimiento;
    double monto;
    int Empleado_idEmpleado;
    int Cuenta_idCuenta;
    int Cuenta_Destino;
    int Tipo_Movimiento_idTipo_Movimiento;
    Date Fecha;
    Date Hora;

    public Movimiento(int idMovimiento, double monto, int Empleado_idEmpleado, int Cuenta_idCuenta, int Cuenta_Destino, int Tipo_Movimiento_idTipo_Movimiento, Date Fecha, Date Hora) {
        this.idMovimiento = idMovimiento;
        this.monto = monto;
        this.Empleado_idEmpleado = Empleado_idEmpleado;
        this.Cuenta_idCuenta = Cuenta_idCuenta;
        this.Cuenta_Destino = Cuenta_Destino;
        this.Tipo_Movimiento_idTipo_Movimiento = Tipo_Movimiento_idTipo_Movimiento;
        this.Fecha = Fecha;
        this.Hora = Hora;
    }

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getEmpleado_idEmpleado() {
        return Empleado_idEmpleado;
    }

    public void setEmpleado_idEmpleado(int Empleado_idEmpleado) {
        this.Empleado_idEmpleado = Empleado_idEmpleado;
    }

    public int getCuenta_idCuenta() {
        return Cuenta_idCuenta;
    }

    public void setCuenta_idCuenta(int Cuenta_idCuenta) {
        this.Cuenta_idCuenta = Cuenta_idCuenta;
    }

    public int getCuenta_Destino() {
        return Cuenta_Destino;
    }

    public void setCuenta_Destino(int Cuenta_Destino) {
        this.Cuenta_Destino = Cuenta_Destino;
    }

    public int getTipo_Movimiento_idTipo_Movimiento() {
        return Tipo_Movimiento_idTipo_Movimiento;
    }

    public void setTipo_Movimiento_idTipo_Movimiento(int Tipo_Movimiento_idTipo_Movimiento) {
        this.Tipo_Movimiento_idTipo_Movimiento = Tipo_Movimiento_idTipo_Movimiento;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Date getHora() {
        return Hora;
    }

    public void setHora(Date Hora) {
        this.Hora = Hora;
    }
    
}
