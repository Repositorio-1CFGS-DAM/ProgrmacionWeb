package Funciones;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Dime la cantidad en millas: ");
        int millas = leer.nextInt();
        double conv = millas_a_kilometros(millas);
        System.out.println(conv);

    }
    public static double millas_a_kilometros(int a){
       return a*1.60934;

    }
}
