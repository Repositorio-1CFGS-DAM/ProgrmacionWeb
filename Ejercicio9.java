package Funciones;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime el primer valor: ");
        int num = leer.nextInt();
        System.out.println("Dime el segundo valor: ");
        int num_2 = leer.nextInt();
        System.out.println("Dime el tercer valor: ");
        int num_3 = leer.nextInt();
        int mayor=elevado(num, num_2);
        if (mayor>num_3){
            System.out.println("El mas grande es "+ mayor);
        } else {
            System.out.println("El mas grande es "+num_3);
        }
    }
    public static int elevado(int a, int b){
        if (a>b){
           return a;
        } else {
            return b;
        }
    }
}
