package com.company.composicion;

public class Habitacion {
    private int numeroHabitacion;
    private double tamanhoHabitacion;

    public Habitacion(int numeroHabitacion, double tamanhoHabitacion){
        this.numeroHabitacion = numeroHabitacion;
        this.tamanhoHabitacion = tamanhoHabitacion;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public double getTamanhoHabitacion() {
        return tamanhoHabitacion;
    }
}
