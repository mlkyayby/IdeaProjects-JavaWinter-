package day34_accessModifier_encapsulation;

public class C04_Encapsulation {
    public static void main(String[] args) {
        /* bir variableyi encapsule etmek icin
        1- Access modifieri private
        2- okuma ve yazma ozelliklerinin kullanilmasini istedigimiz gibi sinirlayabiliriz
        - Eger sadece okunmasini istiyorsaniz getter
        - sadece deger girilebilsin isterseniz setter methodlarini olustururuz
        Bir variable icin hem getter hem stter olusturursaniz
        o variable public olmus gibi hem okuyup hemde yazmasini saglayabilirisiniz

        piyasada developperlar arasinda genel uygulama da boyledir
        */

        C03 obj=new C03();

        System.out.println(obj.getSayi());

        obj.setStr("Java Java Java");
        System.out.println(obj.getStr());
        System.out.println(obj);
    }
}
