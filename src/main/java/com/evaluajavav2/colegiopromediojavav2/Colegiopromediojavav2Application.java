package com.evaluajavav2.colegiopromediojavav2;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import com.evaluajavav2.colegiopromediojavav2.model.Alumnos;
import com.evaluajavav2.colegiopromediojavav2.model.Profesores;
import com.evaluajavav2.colegiopromediojavav2.model.Curso;

@SpringBootApplication
public class Colegiopromediojavav2Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del alumno 1:");
        String nombreAlumno1 = scanner.nextLine();
        Alumnos alumno1 = new Alumnos(nombreAlumno1);

        System.out.println("Ingrese el nombre del alumno 2:");
        String nombreAlumno2 = scanner.nextLine();
        Alumnos alumno2 = new Alumnos(nombreAlumno2);

        System.out.println("Ingrese el nombre del profesor:");
        String nombreProfesor = scanner.nextLine();
        Profesores profesor = Profesores.getInstance(nombreProfesor);

        System.out.println("Ingrese el nombre del curso:");
        String nombreCurso = scanner.nextLine();
        Curso curso = new Curso(nombreCurso);

        System.out.println("Ingrese las notas del alumno :");
        HashMap<String, Double> notas1 = new HashMap<String, Double>();
        System.out.println("Ingrese la nota del parcial 1:");
        notas1.put("Parcial 1", scanner.nextDouble());
        System.out.println("Ingrese la nota del parcial 2:");
        notas1.put("Parcial 2", scanner.nextDouble());
        System.out.println("Ingrese la nota del parcial 3:");
        notas1.put("Parcial 3", scanner.nextDouble());
        profesor.ingresarNotas(alumno1, notas1);

        System.out.println("Ingrese las notas del alumno 2");
        HashMap<String, Double> notas2 = new HashMap<String, Double>();
        System.out.println("Ingrese la nota del parcial 1:");
        notas2.put("Parcial 1", scanner.nextDouble());
        System.out.println("Ingrese la nota del parcial 2:");
        notas2.put("Parcial 2", scanner.nextDouble());
        System.out.println("Ingrese la nota del parcial 3:");
        notas2.put("Parcial 3", scanner.nextDouble());
        profesor.ingresarNotas(alumno2, notas2);

        curso.agregarAlumno(alumno1);
        curso.agregarAlumno(alumno2);

        curso.mostrarAlumnos();

        ArrayList<Double> notas = new ArrayList<Double>();
        notas.addAll(notas1.values());
        notas.addAll(notas2.values());

        double maxNota = Collections.max(notas);
        double minNota = Collections.min(notas);
        double promedioNotas = notas.stream().mapToDouble(Double::doubleValue).average().orElse(Double.NaN);

        System.out.println("La mejor nota es: " + maxNota);
        System.out.println("La peor nota es: " + minNota);
        System.out.println("El promedio de notas es: " + promedioNotas);

        scanner.close();
    }
}