package com.evaluajavav2.colegiopromediojavav2.model;

import java.util.ArrayList;

public class Curso {
    private String nombre;
    private ArrayList<Alumnos> alumnosArray;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.alumnosArray = new ArrayList<Alumnos>();
    }

    public void agregarAlumno(Alumnos alumno) {
        this.alumnosArray.add(alumno);
    }

    public void mostrarAlumnos() {
        for (Alumnos alumno : this.alumnosArray) {
            System.out.println(alumno.getNombre());
        }
    }

    @Override
    public String toString() {
        return "Curso [nombre=" + nombre + ", alumnosArray=" + alumnosArray + "]";
    }
    
}

