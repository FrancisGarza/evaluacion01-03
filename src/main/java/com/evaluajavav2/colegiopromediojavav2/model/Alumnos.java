package com.evaluajavav2.colegiopromediojavav2.model;

import java.util.HashMap;

public class Alumnos extends Usuario {
    private HashMap<String, Double> notas;

    public Alumnos(String nombre) {
        super(nombre);
        this.notas = new HashMap<String, Double>();
    }

    public void ingresarNota(String materia, Double nota) {
        this.notas.put(materia, nota);
    }

    public void ingresarNotas(HashMap<String, Double> notas) {
        this.notas.putAll(notas);
    }

    public double obtenerPromedio() {
        double promedio = 0.0;
        for (double nota : this.notas.values()) {
            promedio += nota;
        }
        promedio /= this.notas.size();
        return promedio;
    }

    @Override
    public String toString() {
        return "Alumnos [notas=" + notas + "]";
    }
    
}
