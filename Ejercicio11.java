package Funciones;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int num=leer.nextInt();
        tabla(num);
    }
    public static void tabla(int a){
        System.out.println("La tabla de "+a);
        for (int i=0;i<=10;i++){
            System.out.println(a+" x "+i+" = "+a*i);
        }
    }
}
