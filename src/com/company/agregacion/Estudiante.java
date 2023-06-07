package com.company.agregacion;

public class Estudiante {
    private String nombre;
    private int edad;
    private int numeroDeEstudiante;

    public Estudiante(String nombre, int edad, int numeroDeEstudiante){
        this.nombre = nombre;
        this.edad = edad;
        this.numeroDeEstudiante = numeroDeEstudiante;
    }

    public void mostrarInformacion() {
        System.out.println("nombre: " + nombre + ", edad: " + edad + ", " +
                "numero de estudiante: " + numeroDeEstudiante + ".");
    }
}
