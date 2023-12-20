package Funciones;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Dime el DNI sin la letra: ");
        int dni = leer.nextInt();
        char lletra = letra_dni(dni);
        System.out.println("La letra del dni "+dni+" es "+lletra);
    }
    public static char letra_dni(int a){
        char letra=' ';
        int div=a%23;
        if (div==0){
            letra='T';
        } else if (div==1) {
            letra='R';
        } else if (div==2) {
            letra='W';
        } else if (div==3) {
            letra='A';
        } else if (div==4) {
            letra='G';
        } else if (div==5) {
            letra='M';
        } else if (div==6) {
            letra='Y';
        } else if (div==7) {
            letra='F';
        } else if (div==8) {
            letra='P';
        } else if (div==9) {
            letra='D';
        } else if (div==10) {
            letra='X';
        } else if (div==11) {
            letra='B';
        } else if (div==12) {
            letra='N';
        } else if (div==13) {
            letra='J';
        } else if (div==14) {
            letra='Z';
        } else if (div==15) {
            letra='S';
        } else if (div==16) {
            letra='Q';
        } else if (div==17) {
            letra='V';
        } else if (div==18) {
            letra='H';
        } else if (div==19) {
            letra='L';
        } else if (div==20) {
            letra='C';
        } else if (div==21) {
            letra='K';
        } else if (div==22) {
            letra='E';
        }
        return letra;
    }
}
