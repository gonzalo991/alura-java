package org.example;

import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0, mediaEvaluaciones = 0, totalEvaluaciones = 0;

        while(nota != -1){
            System.out.println("Escribe la nota que le darías a la película Matrix: ");
            nota = Double.parseDouble(teclado.next());

            if(nota != -1) {
                mediaEvaluaciones += nota;
                totalEvaluaciones++;
            }
        }
        System.out.println(mediaEvaluaciones / totalEvaluaciones);
    }
}
