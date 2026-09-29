/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.unidad1.tda.TDAVisual;

/**
 *
 * @author Humbe
 */
public final class CalcularPromedio {
   //Atributos del TDA
    private String nombre;
    private double calif1;
    private double calif2;
    private double calif3;
    private double promedio;

    //Datos por default (Constructor Vacio) se ejecuta cuando no se ponen ningun dato.
    public CalcularPromedio() {
        nombre = "Alumno 1";
        calif1 = 0;
        calif2 = 0;
        calif3 = 0;
        promedio = 0;
    }

    //Constructor por parametros, permite crear un alumno proporcionando sus datos en este caso siendo nombre,
    // calificacion1, calificacion2, calificacion3 y su promedio.
    public CalcularPromedio(String nombre, double calif1, double calif2, double calif3) {
        this.nombre = nombre;
        setCalif1(calif1);
        setCalif2(calif2);
        setCalif3(calif3);
        calcularPromedio();
    }
    
    //Metodo de Logica 1: Encargado de realizar el calculo de las 3 calificaciones para dar el promedio
    public void calcularPromedio() {
        promedio = (calif1 + calif2 + calif3) / 3;
    }
    
    //Metodo de logica 2: Encargado de obtener la calificacion mayor entre las 3 calificaciones ingresadas
    public double calcularCalifMayor(){
        double mayor = calif1;

        if (calif2 > mayor) {
            mayor = calif2;
        }

        if (calif3 > mayor) {
            mayor = calif3;
        }

        return mayor;
    }
    
    //Meotod de logica 3: Encargada de obtener la calificacion menor entre las 3 calificaciones ingresadas
    public double calcularCalifMenor(){
        double menor = calif1;

        if (calif2 < menor) {
            menor = calif2;
        }

        if (calif3 < menor) {
            menor = calif3;
        }

        return menor;
    }

    // MÉTODO de logica 4: Encargado de calcular si el alumno esta aprobado o no.
    public boolean estaAprobado() {
        return promedio >= 6;
    }

    // MÉTODO RECURSIVO, se utiliza otro metodo para realizar el calculo del promedio mediante recursividad
    // pues el metodo sumarCalificaciones se llama a si mismo para realizar la suma
    public double calcularPromedioRecursivo() {
        return sumarCalificaciones(1, 0) / 3;
    }

    // Método auxiliar recursivo, este se acumula por medion de la posicion pera saber en que calificacion es ta
    // si esta en calif 1 o en la posicion de calif2, la suma se riefere a la suma de las calificaciones.
    private double sumarCalificaciones(int posicion, double suma) {

        if (posicion > 3) {
            return suma;
        }

        double calificacion = 0;

        switch (posicion) {
            case 1 -> calificacion = calif1;
            case 2 -> calificacion = calif2;
            case 3 -> calificacion = calif3;
            default -> {
            }
        }

        return sumarCalificaciones(posicion + 1, suma + calificacion);
    }
    
    // Gtters (recogen los datos privados)
    public String getNombre() {
        return nombre;
    }

    public double getCalif1() {
        return calif1;
    }

    public double getCalif2() {
        return calif2;
    }

    public double getCalif3() {
        return calif3;
    }

    public double getPromedio() {
        return promedio;
    }

    //Setters (realiza las validaciones)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalif1(double calif1) {
        if (calif1 >= 0 && calif1 <= 10) {
            this.calif1 = calif1;
        } else {
            this.calif1 = 0;
        }
        calcularPromedio();
    }

    public void setCalif2(double calif2) {
        if (calif2 >= 0 && calif2 <= 10) {
            this.calif2 = calif2;
        } else {
            this.calif2 = 0;
        }
        calcularPromedio();
    }

    public void setCalif3(double calif3) {
        if (calif3 >= 0 && calif3 <= 10) {
            this.calif3 = calif3;
        } else {
            this.calif3 = 0;
        }
        calcularPromedio();
    }
}
