/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.unidad1.tda;

/**
 *
 * @author Humbe
 */
public class CuentaBancaria {
    //Atributo de una cuenta bancaria
    private float Saldo;
    private String NumCuenta;
    private String Titular;
    
    //Creamos nuestros constructores
    //Constructor por Default
    public CuentaBancaria(){
        Saldo = 0.0f;
        NumCuenta = "************";
        Titular = "Guest001";
    }
    
    //Constructor parametrico
    public CuentaBancaria(float saldo, String cuenta, String titular){
        if(saldo<0){
            Saldo = 0;
        }else{
            Saldo = saldo;
        }
        NumCuenta = cuenta;
        Titular = titular;
    }
    
    //Constructor copia
    public CuentaBancaria(CuentaBancaria copia){
        Saldo = copia.Saldo;
        NumCuenta = copia.NumCuenta;
        Titular = copia.Titular;
    }
    
    //Constructor paea crear cuenta sin saldo inicial
    public CuentaBancaria(String cuenta, String Titular){
        Saldo = 0.0f;
        NumCuenta = cuenta;
        this.Titular = Titular;
    }
    
    //Propiedades que se pueden realizar (Saldo No, Cuenta get, Titular get)
    public String GetCuenta(){
        return NumCuenta;
    }
    
    public String GetTitular(){
        return Titular;
    }
    
    //Metodos
    //Deposito
    public boolean Deposito(float cantidad){
        if(cantidad <= 0){
            //throw new IllegalArgumentException("No puedes depositar cantidades negativas ni cero.");
            return false;
        }
        Saldo = Saldo + cantidad;
        return true;
    }
    
    //Retiro
    public boolean Retiro(float cantidad){
        if(cantidad <= 0){
            return false;
        }
        
        if(cantidad > Saldo){
            return false;
        }
        
        Saldo = Saldo - cantidad;
        return true;
    }
    
    public float ConsultarSaldo(){
        return Saldo;
    }
}
