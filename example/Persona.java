package org.example;

public class Persona {
    protected int id;
    protected String nombre;
    protected char genero; //masculino M o femenino F

    public Persona(int id, String nombre, char genero){
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
    }
    // getters
    public int getId(){
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public char getGenero() {
        return genero;
    }
}
