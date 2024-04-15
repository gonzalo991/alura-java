package org.example;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String cliente = "Tony Stark";
        String tipoCuenta = "corriente";
        double saldo = 1599.0;
        double valorRetirado, valorDepositado;
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("********************");
        System.out.println("\n Nombre del cliente: "+cliente);
        System.out.println("\n Tipo de cuenta: "+tipoCuenta);
        System.out.println("\n Saldo disponible: "+saldo);
        System.out.println("\n********************");

        String menu = """
                **** Escriba el número de la opción deseada *****
                1. Consultar saldo
                2. Depositar
                3. Retirar
                9. Salir
                """;

        while(opcion != 9){
            System.out.println(menu);
            opcion = Integer.parseInt(teclado.next());

            switch(opcion){
                case 1:
                    System.out.println("El saldo actualizado es: "+saldo);
                    break;
                case 2:
                    System.out.println("¿Cuál es el valor que desea retirar?");
                    valorRetirado = Double.parseDouble(teclado.next());
                    if (saldo < valorRetirado){
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= valorRetirado;
                        System.out.println("El saldo actualizado es: "+ saldo);
                    }
                    break;
                case 3:
                    System.out.println("¿Cuál es el valor que desea depositar?");
                    valorDepositado = Double.parseDouble(teclado.next());
                    saldo += valorDepositado;
                    System.out.println("El saldo actualizado es: "+ saldo);
                    break;
                case 9:
                    System.out.println("Saliendo del programa... Gracias por utilizar nuestro servicio.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}
