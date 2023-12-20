package Funciones;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Dime los kilometros: ");
        double kilo = leer.nextDouble();
        double millas = kilo_mill(kilo);
        System.out.println(kilo+" kilometros son "+millas+" millas.");
    }
    public static double kilo_mill(double a){
        return a/1.609;
    }
}
