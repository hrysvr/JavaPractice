package day_06;

public class Ogrenci extends Kisi {

    //Ad-Soyad,  kimlik No, yaş, numara
    private int numara;
    private String sinif;

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }


    @Override
    public String toString() {
        return super.toString() +"numara=" + numara + '\'' +
                ", sinif='" + sinif  +
                '}';
    }
}
