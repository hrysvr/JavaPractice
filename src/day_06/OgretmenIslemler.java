package day_06;

import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OgretmenIslemler implements IIslemler{

    Scanner scan = new Scanner(System.in);
    static int sicilNo= 1000;
    ArrayList<Ogretmen> ogretmenList=new ArrayList<>();

    void ogrtMenu(){
        System.out.println("============= İŞLEMLER =============\n" +
                           "\t\t 1-EKLEME\n" +
                           "\t\t 2-ARAMA\n" +
                           "\t\t 3-LİSTELEME\n" +
                           "\t\t 4-SİLME\n" +
                           "\t\t Q-ÇIKIŞ\n" +
                           "\t\t SEÇİMİNİZ:");

        try {
            int secim = scan.nextInt();
            switch (secim){
                case 1:{
                    ekleme();
                }
                case 2:{
                    arama();
                }
                case 3:{
                    listeleme();
                }
                case 4:{
                    silme();
                }
            }
        }catch (InputMismatchException e){
            String secim=scan.next();
            if (secim.equalsIgnoreCase("q")){
                AnaMenu anaMenu=new AnaMenu();
                anaMenu.menu();
            }else {
                System.out.println("HATALI GIRIS YAPILDI");
                ogrtMenu();
            }
        }
    }






    @Override
    public void ekleme() {

        System.out.print("OGRETMENIN ADINI GIRINIZ: ");
        scan.nextLine();
        String ad= scan.nextLine();
        System.out.print("OGRETMENIN SOYADINI GIRINIZ: ");
        String sAd= scan.nextLine();
        System.out.print("OGRETMENIN TC'SINI GIRINIZ: ");
        String tcNo= scan.nextLine();
        System.out.print("OGRETMENIN YASINI GIRINIZ: ");
        int yas= scan.nextInt();
        scan.nextLine();
        System.out.print("OGRETMENIN BOLUMUNU GIRINIZ: ");
        String bolum= scan.nextLine();
        Ogretmen ogretmen=new Ogretmen(ad,sAd,tcNo,yas,bolum,sicilNo++);
        ogretmenList.add(ogretmen);
    }

    @Override
    public void arama() {

    }

    @Override
    public void listeleme() {

    }

    @Override
    public void silme() {

    }
}
