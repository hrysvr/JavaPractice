package day_01;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {

        /*
         * Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfine gelirse
         * döngüden çıkılsın
         *
         * Bugün hava oldukca güzel.-> 2
         *
         *
         */

        System.out.println("Lutfen bir cumle giriniz");
        Scanner scan=new Scanner(System.in);
        String cumle=scan.nextLine().toUpperCase();
        int sayac=0;

        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.charAt(i)=='A') {
                sayac++;

            }
            if (cumle.charAt(i)=='C') {
                break;
            }

        }
        System.out.println(cumle + "----> " + sayac);

    }

}
