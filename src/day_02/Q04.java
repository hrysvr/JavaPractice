package day_02;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {

        /*
        Bir sayinin mükemmel olup olmadiğini bulan bir method yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)
 */
        System.out.println("bir sayi giriniz");
        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();


        if (mukemmelSayi(sayi)){
            System.out.println(sayi + " mukemmel sayidir");
        }else {
            System.out.println(sayi + "mukemmel sayi degildir");
        }


    }

    static boolean mukemmelSayi(int sayi) {
        int toplam = 0;

        for (int i = sayi - 1; i >= 1; i--) {
            if (sayi % i == 0) {
                toplam += i;

            }
        }
        if (toplam == sayi) {
            return true;
        } else{
            System.out.println("degil");
            return false;

        }
    }

}
