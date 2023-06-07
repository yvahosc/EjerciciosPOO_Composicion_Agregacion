package com.company.composicion;

import java.util.Arrays;

public class Casa {
    private Habitacion[] habitaciones;
    private int cantidadHabitaciones;
    private final int CAPACIDAD_MAXIMA = 100;

    public Casa(){
        habitaciones = new Habitacion[CAPACIDAD_MAXIMA];
        cantidadHabitaciones = 0;
    }

    public void agregarHabitacion(Habitacion habitacion){
        if(cantidadHabitaciones < CAPACIDAD_MAXIMA){
            habitaciones[cantidadHabitaciones] = habitacion;
            cantidadHabitaciones++;
        } else{
            System.out.println("No es posible agregar más habitaciones. " +
                    "capacidad excedida.");
        }
    }

    public void destruirCasa(){
        habitaciones = new Habitacion[CAPACIDAD_MAXIMA];
    }

    public void mostrarInformacionCasa() {
        System.out.println("Casa: \n" +
                "habitaciones: " + Arrays.toString(habitaciones) +
                ", cantidadHabitaciones: " + cantidadHabitaciones +
                ", CAPACIDAD_MAXIMA: " + CAPACIDAD_MAXIMA + ".");
    }
}
