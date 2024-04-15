package org.example;

import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite los grados Celsius que desea convertir: ");
        double temperatura = Double.parseDouble(leer.nextLine());

        int resultado = (int) (temperatura * 1.8) + 32;

        System.out.println(String.format("La medida de temperatura: %f °C es igual a : %d ° Fahrenheit.", temperatura, resultado));
    }
}
