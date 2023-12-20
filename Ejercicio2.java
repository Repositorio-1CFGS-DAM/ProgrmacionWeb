package Funciones;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Dime tu edad: ");
        int edad = leer.nextInt();
        if (age(edad)){
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
    public static boolean age(int age){
        if (age>=18){
            return true;
        } else {
            return false;
        }
    }
}
