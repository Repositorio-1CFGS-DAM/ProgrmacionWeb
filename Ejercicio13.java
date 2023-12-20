package Funciones;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Dime el precio sin descuento: ");
        double precio_sin = leer.nextDouble();
        System.out.print("Dime el precio con descuento: ");
        double precio_con = leer.nextDouble();
        double desc=iva(precio_sin, precio_con);
        System.out.println("El descuento es del "+desc+"%");
    }
    public static double iva(double a, double b){
        double descuento=a-b;
        return (descuento/a)*100;
    }
}
