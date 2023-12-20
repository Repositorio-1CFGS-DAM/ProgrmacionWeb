package Funciones;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int num_1 = leer.nextInt();
        System.out.print("Dime otro numero: ");
        int num_2 = leer.nextInt();
        menor(num_1, num_2);

    }
    public static void menor(int a, int b){
        if (a<b){
            System.out.println("El menor es: "+a);
        } else {
            System.out.println("El menor es: "+b);
        }
    }
}
