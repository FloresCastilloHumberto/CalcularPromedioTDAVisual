/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.unidad1.tda;

/**
 *
 * @author Humberto Flores Castillo
 * @author Jesus Eduardo Hernandez Hernandez
 */
public class CalcularPromedio {
    //Atributos
    private String nombre;
    private String matricula;
    private String materia;
    private float calif1;
    private float calif2;
    private float calif3;
    private float promedio;
    
    //Datos por default
    public CalcularPromedio()
    {
        nombre = "Alumno1";
        matricula = "********";
        materia = "Sin Materia";
        calif1 = 0.0f;
        calif2 = 0.0f;
        calif3 = 0.0f;
        promedio = 0.0f;
    }
    
    //Le da un limite a las calificaciones es decir, que no puede ingresar una calificacion mayor a 10 o menor a 0
    //con esto nos evitamos que haya calificaciones registradas como 22 o -12.
    public CalcularPromedio(float calif1, float calif2, float calif3, String nombre, String matricula, String materia)
    {
        if(calif1 < 0 || calif1 > 10)
        {
            System.out.println("La calificacion ingresada no puede ser menor a 0 o mayora 10");
        }else{
            this.calif1 = calif1;
        }
        
        if(calif2 < 0 || calif2 > 10)
        {
            System.out.println("La calificacion ingresada no puede ser menor a 0 o mayora 10");
        }else{
            this.calif2 = calif2;
        }
        
        if(calif3 < 0 || calif3 > 10)
        {
            System.out.println("La calificacion ingresada no puede ser menor a 0 o mayora 10");
        }else{
            this.calif3 = calif3;
        }
        
        this.nombre = nombre;
        this.matricula = matricula;
        this.materia = materia;
    }
    
    //Calcula el promedio con las tres calificaciones
    public float CalcularPromedio(float calif1, float calif2, float calif3)
    {
        promedio = (calif1 + calif2 + calif3)/3;
        
        return promedio;
    }
    
    //Setters Dan la posibilidad de poder cambiar la materia, nombre y matricula del alumno al que se le esta calculando 
    //el promedio se valida que no haya en la materia, nombre o matricula vacia
    public boolean CambiarMateria(String materia)
    {
        if(materia == null)
        {
            return false;
        }

        this.materia = materia;
        return true;
    }
    
    public boolean CambiarNombre(String nombre)
{
    if(nombre == null)
    {
        return false;
    }

    this.nombre = nombre;
    return true;
}
    
    public boolean CambiarMatricula(String matricula)
    {
        if(matricula == null)
        {
            return false;
        }

        this.matricula = matricula;
        return true;
    }
    
    //Metodos Getter
    public String GetNombre()
    {
        return nombre;
    }

    public String GetMatricula()
    {
        return matricula;
    }

    public String GetMateria()
    {
        return materia;
    }
    
    public float GetCalif1()
    {
        return calif1;
    }

    public float GetCalif2()
    {
        return calif2;
    }

    public float GetCalif3()
    {
        return calif3;
    }
    
    public static void main(String[] args)
    {
        CalcularPromedio alumno = new CalcularPromedio(
                8.0f,
                9.0f,
                10.0f,
                "Juan",
                "20240001",
                "Estructura de Datos"
        );
        
        System.out.println("===== DATOS ORIGINALES =====");
        System.out.println("Nombre: " + alumno.GetNombre());
        System.out.println("Matricula: " + alumno.GetMatricula());
        System.out.println("Materia: " + alumno.GetMateria() + "\n");

        // Cambiamos los datos utilizando los metodos
        alumno.CambiarNombre("Pedro");
        alumno.CambiarMatricula("20240025");
        alumno.CambiarMateria("Programacion");
        
        
        float resultado = alumno.CalcularPromedio(
                alumno.GetCalif1(),
                alumno.GetCalif2(),
                alumno.GetCalif3()
        );
        
        //Se imprime en pantalla el resultado del promedio y los datos del alumno
        System.out.println("===== DATOS DEL ALUMNO =====");
        System.out.println("Nombre: " + alumno.GetNombre());
        System.out.println("Matricula: " + alumno.GetMatricula());
        System.out.println("Materia: " + alumno.GetMateria());
        System.out.println("Calificacion 1: " + alumno.GetCalif1());
        System.out.println("Calificacion 2: " + alumno.GetCalif2());
        System.out.println("Calificacion 3: " + alumno.GetCalif3());
        System.out.println("Promedio: " + resultado);
        
    }
}
    
