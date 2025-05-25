package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Alumno[] aula = new Alumno[3];
        aula[0] = new Alumno(1,"Cristian",'M',new double[]{6.5,6.7,8.3});
        aula[1] = new Alumno(2,"Oscar",'M', new double[] {7.4,6.0,9.0});
        aula[2] = new Alumno(3,"Sara", 'F', new double[]{7.6,6.5,7.0});

        Metodos met = new Metodos();
        met.importarDelArreglo(aula);

        met.mostarAprobados();
        met.mostrarReprobados();
        }
    }
