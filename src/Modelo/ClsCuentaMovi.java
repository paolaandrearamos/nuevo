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
public class ClsCuentaMovi {

    int idCuenta;
    String descripcion;
    int Banco_idBanco;
    int Sucursal_idSucursal;
    int Tipo_cuenta_idTipo_cuenta;
    String password;
    int Persona_cedula;
    double saldo;

    public ClsCuentaMovi(int idCuenta, String descripcion, int Banco_idBanco, int Sucursal_idSucursal, int Tipo_cuenta_idTipo_cuenta, String password, int Persona_cedula, double saldo) {
        this.idCuenta = idCuenta;
        this.descripcion = descripcion;
        this.Banco_idBanco = Banco_idBanco;
        this.Sucursal_idSucursal = Sucursal_idSucursal;
        this.Tipo_cuenta_idTipo_cuenta = Tipo_cuenta_idTipo_cuenta;
        this.password = password;
        this.Persona_cedula = Persona_cedula;
        this.saldo = saldo;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getBanco_idBanco() {
        return Banco_idBanco;
    }

    public void setBanco_idBanco(int Banco_idBanco) {
        this.Banco_idBanco = Banco_idBanco;
    }

    public int getSucursal_idSucursal() {
        return Sucursal_idSucursal;
    }

    public void setSucursal_idSucursal(int Sucursal_idSucursal) {
        this.Sucursal_idSucursal = Sucursal_idSucursal;
    }

    public int getTipo_cuenta_idTipo_cuenta() {
        return Tipo_cuenta_idTipo_cuenta;
    }

    public void setTipo_cuenta_idTipo_cuenta(int Tipo_cuenta_idTipo_cuenta) {
        this.Tipo_cuenta_idTipo_cuenta = Tipo_cuenta_idTipo_cuenta;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPersona_cedula() {
        return Persona_cedula;
    }

    public void setPersona_cedula(int Persona_cedula) {
        this.Persona_cedula = Persona_cedula;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
