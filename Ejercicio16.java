package Funciones;
import java.lang.Math;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Dime el tamaño del array: ");
        int tamano= leer.nextInt();
        int v[] = new int[tamano];
        v=aleatorios(v);
        for (int i=0;i<v.length;i++){
            System.out.println("La posicion "+i+" vale "+v[i]);
        }
    }
    public static int[] aleatorios(int a[]){
        for (int i=0;i<a.length;i++){
            a[i]=(int) (1+Math.random()*(50-1));
        }
        return a;
    }
}
