package Funciones;

public class Ejercicio15 {
    public static void main(String[] args){
        int v[] = new int[100];
        for (int i=0,l=1;i<v.length;i++,l++){
            v[i]=l;
        }
        sum_vec(v);
        medi_vec(v);
    }
    public static void sum_vec(int a[]){
        int suma=0;
        for (int i=0;i<a.length;i++){
            suma=suma+a[i];
        }
        System.out.println("La suma del vector es: "+suma);
    }
    public static void medi_vec(int a[]){
        int suma=0;
        int cant=0;
        for (int i=0;i<a.length;i++){
            suma=suma+a[i];
            cant++;
        }
        System.out.println((double)suma/cant);
    }
}
