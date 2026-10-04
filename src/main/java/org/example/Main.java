package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {

    }
    public static int saisirEntierStrictementPositif() {
        int valeur;
        do {
            System.out.println("Please input a number strictly >0");
            valeur = Scanner.nextInt();
        } while (valeur <= 0);
        return valeur;
    }

    public static int saisirEntierPositifOuNul() {
        int valeur;
        do {
            System.out.println("Please input a number superior or equal to 0");
            valeur = Scanner.nextInt();
        } while (valeur < 0);
        return valeur;
    }





    public static void ruler() {
        System.out.println("Length of the ruler ?");
        int length=saisirEntierStrictementPositif();
        StringBuilder table = new StringBuilder();
        for(int i=0;i<length;i++){
            if(i%10==0) {
                table.append("|");
            }else {
                table.append('-');
            }
            }
        System.out.println(table);
        }

    public static boolean primenumber(){
        int n = saisirEntierStrictementPositif();
        int dividingNumber = 0;
        for (int i = 1;i<=n;i++){
            if(n%i==0) {
                dividingNumber++;
            }
            }
        if(dividingNumber==2){
            System.out.println(n + "is prime");
        }else{
            System.out.println(n + "isn't prime");
        }
    }


    }

