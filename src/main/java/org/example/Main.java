package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Which exercise?");
        System.out.println("9. Ruler");
        System.out.println("10. Prime numbers");
        System.out.println("11. Manipulations on a painting");
        System.out.println("13. Hamming distance");

        int choice = scanner.nextInt();

        switch (choice) {

            case 9:
                ruler();
                break;

            case 10:
                primenumber();
                break;

            case 11:
                initialisationTableau();
                break;

            case 12:
                System.out.println(search('o', "horse"));
                System.out.println(search('a', "school"));
                break;

            case 13:
                System.out.println(hamming("aaba", "aaha"));
                System.out.println(hamming("pear", "apple"));
                System.out.println(hamming("pen", "bottle"));
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
    public static int saisirEntierStrictementPositif() {
        int valeur;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Please input a number strictly >0");
            valeur = scanner.nextInt();
        } while (valeur <= 0);

        return valeur;
    }

    public static int saisirEntierPositifOuNul() {
        int valeur;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Please input a number superior or equal to 0");
            valeur = scanner.nextInt();
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

    public static void primenumber() {
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


    public static void initialisationTableau() {

        int[] tableau = new int[20];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Enter an integer:");
            tableau[i] = scanner.nextInt();
        }
        int minimum = tableau[0];
        int maximum = tableau[0];

        for (int i = 1; i < tableau.length; i++) {

            if (tableau[i] < minimum) {
                minimum = tableau[i];
            }

            if (tableau[i] > maximum) {
                maximum = tableau[i];
            }

    }
    System.out.println("Minimum = " + minimum);
    System.out.println("Maximum = " + maximum);

    int sum = 0;

    for (int i = 0; i < tableau.length; i++) {
            sum += tableau[i];
    }

    System.out.println("Sum = " + sum);


    System.out.println("Even elements:");

    for (int i = 0; i < tableau.length; i++) {

            if (tableau[i] % 2 == 0) {
                System.out.print(tableau[i] + " ");
            }
    }
    System.out.println();
        System.out.println("Elements at even indexes:");

        for (int i = 0; i < tableau.length; i++) {

            if (i % 2 == 0) {
                System.out.print(tableau[i] + " ");
            }
        }

        System.out.println();
    }


    public static void inverseArray(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {

            int temp = array[i];

            array[i] = array[array.length - 1 - i];

            array[array.length - 1 - i] = temp;
        }
    }
    public static int search(char c, String s) {

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == c) {
                return i;
            }
        }

        return -1;
    }
    public static int hamming(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return -1;
        }

        int distance = 0;

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {
                distance++;
            }
        }

        return distance;
    }
}