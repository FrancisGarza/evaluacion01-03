package com.evaluajavav2.colegiopromediojavav2.model;

import java.util.HashMap;

public class Profesores {
    private static Profesores instance = null;
    private String nombre;

    private Profesores(String nombre) {
        this.nombre = nombre;
    }

    public static Profesores getInstance(String nombre) {
        if (instance == null) {
            instance = new Profesores(nombre);
        }
        return instance;
    }

    public void ingresarNotas(Alumnos alumno, HashMap<String, Double> notas) {
        // código para ingresar las notas del alumno
    }

    @Override
    public String toString() {
        return "Profesores [nombre=" + nombre + "]";
    }

}
