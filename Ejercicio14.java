package Funciones;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Dime el caracter: ");
        char carac = leer.next().charAt(0);
        System.out.print("Dime la altura: ");
        int alt = leer.nextInt();
        triangulo(carac, alt);
    }
    public static void triangulo(char a, int b){
        int esp=b;
        for (int i=1,m=1;m<=b;m++){
            for (int s=esp;s>0;s--){
                System.out.print(" ");
            }
            for (int j=0;j<i;j++){
                System.out.print(a);
            }
            System.out.print("\n");
            i++;
            i++;
            esp--;
        }
    }
}
