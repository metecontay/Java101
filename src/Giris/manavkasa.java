package Giris;

import java.util.Scanner;

public class manavkasa {
    public static void main(String[] args) {
        double armutkg;
        Scanner inp = new Scanner(System.in);
        System.out.print("Armut kaç kilo? : ");
        armutkg = inp.nextDouble();
        double elmakg;
        Scanner inp1 = new Scanner(System.in);
        System.out.print("Elma kaç kilo? : ");
        elmakg = inp1.nextDouble();
        double domateskg;
        Scanner inp2 = new Scanner(System.in);
        System.out.print("Domates kaç kilo? : ");
        domateskg = inp2.nextDouble();
        double muzkg;
        Scanner inp3 = new Scanner(System.in);
        System.out.print("Muz kaç kilo? : ");
        muzkg = inp3.nextDouble();
        double patlicankg;
        Scanner inp4 = new Scanner(System.in);
        System.out.print("Patlıcan kaç kilo? : ");
        patlicankg = inp4.nextDouble();
        double toplam = armutkg * 2.14 + elmakg * 3.67 + domateskg * 1.11 + muzkg * 0.95 + patlicankg * 5;
        System.out.print("Toplam Tutar : " + toplam + "TL");





    }
}
