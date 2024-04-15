package org.example;

public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDePelicula = 8.2;
        String tipoDePlan = "plus";
/*

      if(fechaDeLanzamiento >= 2022){
            System.out.println("Películas mas populares");
        } else {
            System.out.println("Películas Retro que aún vale la pena ver");
        }
*/

        if (incluidoEnElPlan && tipoDePlan.equals("plus")){
            System.out.println("Disfrute de su película");
        } else {
            System.out.println("Película no disponible para su plan actual");
        }
    }
}
