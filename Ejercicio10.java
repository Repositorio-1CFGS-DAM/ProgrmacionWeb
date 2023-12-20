package Funciones;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime el dia: ");
        int dia = leer.nextInt();
        System.out.println("Dime el mes: ");
        int mes = leer.nextInt();
        System.out.println("Dime el año: ");
        int año = leer.nextInt();
        com_fecha(dia, mes, año);
    }
    public static void com_fecha(int a,int b,int c){
        boolean dia=false,mes=false,año=false;
        if (a>1 && a<30){
            dia=true;
        }
        if (b>1 && b<12){
            mes=true;
        }
        if (c>1){
            año=true;
        }
        if (dia && mes && año){
            System.out.println("La fecha "+a+"/"+b+"/"+c+" es correcta");
        } else {
            System.out.println("La fecha "+a+"/"+b+"/"+c+" no es correcta");
        }
    }
}
