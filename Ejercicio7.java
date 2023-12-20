package Funciones;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Dime el ancho del rectangulo: ");
        double ancho = leer.nextDouble();
        System.out.print("Dime el alto del rectangulo: ");
        double alto = leer.nextDouble();
        System.out.println("El perimtro es: " + perimtro_rec(alto, ancho));
        System.out.println("El area es: " + area_rec(alto, ancho));
    }
    public static double perimtro_rec(double a, double b){
        return a+b*2;

    }
    public static double area_rec(double a, double b){
        return a*b;
    }
}
