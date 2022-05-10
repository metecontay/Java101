package Lessons2;

import java.util.Scanner;

public class Ucakbileti {
    public static void main(String[] args) {

        int km, yas, yolculuktipi;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafe Kilometresini giriniz : ");
        km = input.nextInt();

        System.out.print("Yolculuk tipinizi girin - 1-)Tek Yön 2-) Gidiş-Dönüş : ");
        yolculuktipi = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();

        if (km > 0); if (yas > 0);
        System.out.print("Hatalı giriş yaptınız, tekrar deneyiniz.")

        double tutar = (km * 0.10);

        System.out.print("Yolculuk tutarınız : " + tutar ) ;

        if (yas < 12);
        System.out.print(tutar/2);


    }
}
