package day30_passByValue;

public class C04_passByValue {
    // eger bir methodta yapilan degisikligin kalici olmasini istiyorsak
    //iki yontem kullanabiliriz
    //1 variableyi class levelde static olarak olusturabiliriz


    static double etiketFiyati;
    static double indirimYuzdesi;


    public static void main(String[] args) {
        etiketFiyati=100;
        indirimYuzdesi=10;
        kaliciIndirimYap();

    }

    public static void kaliciIndirimYap(){


        etiketFiyati=etiketFiyati*(100-indirimYuzdesi)/100;
        System.out.println("indirimli fiyat:"+etiketFiyati);

    }

}
