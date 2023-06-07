package com.company.agregacion;

public class Universidad {
    private String nombre;
    private Estudiante[] estudiantes;
    private int cantidadDeEstudiantes;
    private final int CAPACIDAD_MAXIMA_ESTUDIANTES = 100;

    public Universidad(String nombre){
        this.nombre = nombre;
        estudiantes = new Estudiante[CAPACIDAD_MAXIMA_ESTUDIANTES];
        cantidadDeEstudiantes = 0;
    }

    public void agregarEstudiante(Estudiante estudiante){
        if(cantidadDeEstudiantes < CAPACIDAD_MAXIMA_ESTUDIANTES){
            estudiantes[cantidadDeEstudiantes] = estudiante;
            cantidadDeEstudiantes++;
        } else{
            System.out.println("No es posible agregar más estudiantes. " +
                    "Cantidad excedida.");
        }
    }

    public Estudiante[] getEstudiantes(){
        return estudiantes;
    }

    public int getCantidadDeEstudiantes(){
        return cantidadDeEstudiantes;
    }
}
