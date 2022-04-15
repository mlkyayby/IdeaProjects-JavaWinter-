package day40_overridding;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class C03_Exception {
    public static void main(String[] args) {
        //kullanicidan iki sayi alip ,bolerek
        //sonucu yazdiran bir program yaziniz

        Scanner scan=new Scanner(System.in);
        int kontrol=0;
        while(kontrol!=2){


            System.out.println("bolmek istediginiz sayiyi girirniz");
            double sayi1= scan.nextDouble();

            System.out.println("kaca bolmek istediginizi yaziniz");
            int sayi2=scan.nextInt();
            System.out.println("sonuc="+sayi1/sayi2);
            System.out.println("devam etmek icin 1 bititrmek icin 2 basin");
            kontrol=scan.nextInt();
        }
   /*
        Sayi2 0 oldugunda sayi1 / 0 tanimsiz olacagindan
        Java bu durumla karsilasinca exception verir
        Javanin yazdigi mesajda exception ne tur bir sorun oldugu
        Neden kaynaklandigi
        ve hangi satirda olustugu yazar
        Exception in thread "main" java.lang.ArithmeticException: / by zero
        at day40_overriding_polymorphism.C03_Exepcitions.main(C03_Exepcitions.java:18)
        bunu cozmek icin sayi2'yi if ile kontrol edebiliriz
        if (sayi2==0){
            System.out.println("Sayi / 0 tanimsizdir");
        } else {
            System.out.println("sonuc = " + sayi1 / sayi2);
        }
         Ama bu yontem her sorunda calismaz
         */


    }
}
