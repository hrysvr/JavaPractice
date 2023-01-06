package day_02;

public class Q05 {

    public static void main(String[] args) {
        ////1-100 e kadar olan sayıların içinde mükemmel olanları yazdıran metodu yazınız
        //1-100 ARASINDAKİ MÜKEMMEL SAYILARI BULAN METODU YAZINIZ

        mukemmelSayi();

    }
    static void mukemmelSayi () {
        int toplam = 0;
        for (int i = 1; i < 100; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    toplam += j;
                }
            }
            if (toplam == i)
                System.out.println(i + " mükemmel sayıdır");
            else
                System.out.println(i + "mükemmel sayı değildir");
            toplam = 0;
        }

    }

}
