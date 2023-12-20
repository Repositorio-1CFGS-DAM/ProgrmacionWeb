package Funciones;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        double num1 = leer.nextDouble();
        System.out.print("Dime otro numero: ");
        double num2 = leer.nextDouble();
        multiplica(num1, num2);
    }
    public static void multiplica(double a, double b){
        System.out.println("El resultado de multiplicar " + a +" x " +b+" es igua a " + a*b);
    }
}
