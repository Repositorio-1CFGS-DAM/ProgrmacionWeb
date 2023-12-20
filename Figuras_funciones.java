package Funciones;

import java.util.Scanner;

public class Figuras_funciones {
    public static void main(String[] args){
        int opcion;
        do {
            opcion=menu();
            switch (opcion){
                case 1:
                    linia();
                    break;
                case 2:
                    quadrat();
                    break;
                case 3:
                    triangulo();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("La opcion "+opcion+" no es correcta.");
            }
        } while (opcion!=4);
    }
    public static int menu(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Menu de opcions: ");
        System.out.println("1.-Linia");
        System.out.println("2.-Quadrat");
        System.out.println("3.-Triangle");
        System.out.println("4.-Eixir");
        System.out.println("-----------------------------");
        System.out.print("Opcion: ");
        return leer.nextInt();
    }
    public static void linia(){
        Scanner leer = new Scanner(System.in);
        int lon;
        do {
            System.out.print("Dime la longitud de la linea(1-80): ");
            lon = leer.nextInt();
        } while(lon<=0 || lon>80);
        for (int i=0;i<lon;i++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
    public static void quadrat(){
        Scanner leer = new Scanner(System.in);
        int alt;
        int ample;
        do {
            System.out.print("Dime el alto del quadrado: ");
            alt = leer.nextInt();
        } while(alt<=0 || alt>20);
        do {
            System.out.print("Dime el ancho del quadrado: ");
            ample = leer.nextInt();
        } while(ample<=0 || ample>80);
        for (int i=0;i<alt;i++){
            for (int j=0;j<ample;j++){
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
    }
    public static void triangulo(){
        Scanner leer = new Scanner(System.in);
        int alt;
        do {
            System.out.print("Dime el alto del triangulo: ");
            alt = leer.nextInt();
        } while(alt<=0 || alt>20);
        for (int i=0;i<=alt;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
