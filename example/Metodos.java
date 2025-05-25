package org.example;

public class Metodos {
    Nodo cabeza = null;

    public void importarDelArreglo(Alumno[] aula){
        for (Alumno alumno : aula){
            agregarAlumno(alumno);
        }
    }

    private void agregarAlumno(Alumno alumno) {
        Nodo nuevo = new Nodo(alumno);
        if (cabeza == null){
            cabeza = nuevo;
        }else {
            Nodo temp = cabeza;
            while (temp.siguiente != null){
                temp =temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
    }
    public void mostarAprobados(){
        System.out.println("aprobados");
        Nodo temp = cabeza;
        while (temp != null){
            if (temp.alumno.getPromedio() >= 7){
                System.out.println(temp.alumno.getNombre()+ ":Promedio"+ temp.alumno.getPromedio());
            }
            temp = temp.siguiente;
        }
    }
    public void mostrarReprobados() {
        System.out.println("Reprobados:");
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.alumno.getPromedio() < 7) {
                System.out.println(temp.alumno.getNombre() + " - Promedio: " + temp.alumno.getPromedio());
            }
            temp = temp.siguiente;
        }
}
}