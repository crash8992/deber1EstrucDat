package org.example;

public class Alumno extends Persona {
    private double [] calificaciones;
    private double promedio;


    public Alumno(int id, String nombre, char genero, double[]calificaciones) {
        super(id, nombre, genero);
        this.calificaciones = calificaciones;
        calcularPromedio();
    }

    private void calcularPromedio() {
        double suma = 0;
        for (double c : calificaciones){
            suma += c;
        }
        promedio = suma / calificaciones.length;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public char getGenero() {
        return super.getGenero();
    }
}
