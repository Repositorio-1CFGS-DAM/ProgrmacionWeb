package Funciones;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.print("Dime el precio sin iva: ");
            double precio = leer.nextDouble();
            System.out.println(precioConIVA(precio));
        }

    }
    public static double precioConIVA(double a){
        return a*1.21;
    }
}
