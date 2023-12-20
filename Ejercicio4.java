package Funciones;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int num= leer.nextInt();
        int resp = pos_neg(num);
        if (resp==0){
            System.out.println(num +"es iguala 0.");
        } else if (resp==-1) {
            System.out.println(num +" es negativo.");
        } else {
            System.out.println(num +" es positivo.");
        }
    }
    public static int pos_neg(int a){
        if (a<0){
            return -1;
        } else if (a==0) {
            return 0;
        } else {
            return  1;
        }
    }
}
