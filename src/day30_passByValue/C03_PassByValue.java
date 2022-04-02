package day30_passByValue;

public class C03_PassByValue {
    public static void main(String[] args) {
        // java pass By Value bir programa dilidir
        //yani bir variableyi argument olarak bir methoda yollarsaniz java o variableyi degil,
        //degerini(value) methoda aktarir (pass)

        int etiketFiyati=100;
        yuzdeOnIndirimYap(etiketFiyati);
        yuzdeOnIndirimYap(etiketFiyati);
        System.out.println("iki indirimden sonra main method ta etiket Fiyati:"+etiketFiyati);
    }

  public static void yuzdeOnIndirimYap(double etiketFiyati) {

        etiketFiyati=etiketFiyati*0.90;
      System.out.println("sizin icin %10 indirimli mfiyatiniz:"+etiketFiyati);

    }
}
