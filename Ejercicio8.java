package Funciones;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args){
      Scanner leer = new Scanner(System.in);
        System.out.print("Dime un  valor: ");
        int N = leer.nextInt();
        System.out.println("El sumatorio de 1 a "+N+" es: "+suma1aN(N));
        System.out.println("El productorio de 1 a "+N+" es: "+producto1aN(N));
        System.out.println("El valor intermedio de 1 a "+N+" es: "+intermedio1aN(N));
    }
    public static int suma1aN(int a){
        int sum=0;
        for (int i=0;i<=a;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static int producto1aN(int a){
        int prod=1;
        for (int i=1;i<=a;i++){
            prod=prod*i;
        }
        return prod;
    }
    public static int intermedio1aN(int a){
        return (a+1)/2;
    }
}
