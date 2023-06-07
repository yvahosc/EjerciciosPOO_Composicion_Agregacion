package com.company;

import com.company.agregacion.Estudiante;
import com.company.agregacion.Universidad;
import com.company.composicion.Casa;
import com.company.composicion.Habitacion;

public class Main {

    public static void main(String[] args) {
        // Ejecución ejercicio agregación.

        //Creando instancia de la clase Universidad
        Universidad universidad1 = new Universidad("Universidad XYZ");

        //Creando instancias de la clase Estudiante
        Estudiante estudiante1 = new Estudiante("Antonia", 22, 1);
        Estudiante estudiante2 = new Estudiante("Joaquin", 32, 2);

        //Agregando estudiantes a la universidad
        universidad1.agregarEstudiante(estudiante1);
        universidad1.agregarEstudiante(estudiante2);

        //imprimiendo nombre universidad
        System.out.println("El nombre de la universidad es: " +
                universidad1.getNombre() + ".");

        //Recorriendo el vector de estudiantes y mostrando la información de
        // cada uno
        for (int i = 0; i < universidad1.getCantidadDeEstudiantes(); i++) {
            System.out.print("\nEstudiante " + i + ": ");
            universidad1.getEstudiantes()[i].mostrarInformacion();
        }

        // Ejecución ejercicio composición.

        //Creando instancia de la clase Casa
        Casa casa = new Casa();

        //Creando instancias de la clase Habitacion
        Habitacion habitacion1 = new Habitacion(1, 10);
        Habitacion habitacion2 = new Habitacion(2, 5.3);

        //Agregando habitaciones a la casa
        casa.agregarHabitacion(habitacion1);
        casa.agregarHabitacion(habitacion2);

        //Mostrando información de la casa
        casa.mostrarInformacionCasa();

        //Llamando método destruirCasa
        casa.destruirCasa();

        //Mostrando información de la casa
        casa.mostrarInformacionCasa();
    }
}
