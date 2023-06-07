package com.company.composicion;


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
        cantidadHabitaciones = 0;
    }

    public void mostrarInformacionCasa() {
        if(cantidadHabitaciones == 0){
            System.out.println("\nCasa: \n" +
                    "Cantidad de habitaciones: " + cantidadHabitaciones +
                    ", capacidad máxima: " + CAPACIDAD_MAXIMA +
                    ", habitaciones: NO hay habitaciones.");
        }else{
            System.out.println("\nCasa: \n" +
                    "Cantidad de habitaciones: " + cantidadHabitaciones +
                    ", capacidad máxima: " + CAPACIDAD_MAXIMA +
                    ", habitaciones: ");
            for (int i = 0; i < cantidadHabitaciones; i++) {
                habitaciones[i].mostrarInformacionHabitacion();
            }
        }
    }
}
