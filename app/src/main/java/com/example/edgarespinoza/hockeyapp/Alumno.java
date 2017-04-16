package com.example.edgarespinoza.hockeyapp;

/**
 * Created by Edgar Espinoza on 13-Apr-17.
 */

public class Alumno {

    private String nombre;
    private int numero;
    private double dolar;

    public String procesarAlumno(String name, int num, double d){
                nombre = name;
        numero = num;
        dolar = d;

        double d1 = (numero * d);
        return nombre;
    }
}
