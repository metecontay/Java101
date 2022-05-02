package Giris;

import java.util.Scanner;

public class kitleindex {
    public static void main(String[] args) {
        double boy;
        Scanner inp = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz : ");
        boy = inp.nextDouble();
        double kilo;
        Scanner input = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz : ");
        kilo = input.nextDouble();
        double index = kilo / boy * boy;
        System.out.print("Vücut Kitle Endeksiniz : " + index);
    }
}
