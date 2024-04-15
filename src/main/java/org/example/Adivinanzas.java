package org.example;

import java.util.Random;
import java.util.Scanner;

public class Adivinanzas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = new Random().nextInt(100);
        int numeroIngresado;
        int intentos = 0;

        while(intentos < 5){
            System.out.println("Ingresa el número mágico: ");
            numeroIngresado = Integer.parseInt(teclado.next());

            if(numeroIngresado == numero){
                System.out.println("¡Felicidades adivinaste el número mágico!");
            } else if( numeroIngresado < numero){
                System.out.println("El número ingresado es menor al número mágico. Vuelve a intentar.");
            } else {
                System.out.println("El número ingresado es mayor al número mágico. Vuelve a intentar.");
            }

            intentos++;
        }
    }
}
