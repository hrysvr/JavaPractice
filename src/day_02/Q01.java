package day_02;

public class Q01 {

    public static void main(String[] args) {


        //100'den 0'a kadar 13'e tam bölünebilen sayıları ve toplamlarını ekrana yazdırınız (büyükten küçüğe).

        int sayi=0;
        int toplam=0;

        for (int i = 100; i >0; i--) {


            if (i%13==0)
                System.out.println(i + "sayisi 13'e tam bolunur.");
            toplam+=i;

        }
        System.out.println("toplam = " + toplam);
    }
}
