package Giris;

import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        int a,b;
        double c;

        Scanner input = new Scanner(System.in);
        System.out.println("1. kenarını giriniz : ");
        a = input.nextInt();
        System.out.println("2. kenarını giriniz : ");
        b = input.nextInt();
        c = Math.sqrt ((a*a) + (b*b)) ;
        System.out.println(" Hipotenüs : "+ c);

    }
}
