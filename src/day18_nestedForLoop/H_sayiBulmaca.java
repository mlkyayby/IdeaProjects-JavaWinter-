package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class H_sayiBulmaca {
    public static void main(String[] args) {
            // bilgisayara 1 ile 100 arasinda bir sayi tutturun
            // kullanicidan bu sayiyi tahmin etmesini isteyin
            // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosteri
           // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin




            Random rnd=new Random();
            Scanner scan=new Scanner(System.in);
            int tahminSayisi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturu
            tahminSayisi=60;
             int kontrol=0;

             while(true){
                 System.out.println("lutfen tahmin sayisi giriniz");
                 int sayi=scan.nextInt();

                if(sayi<tahminSayisi){
                    System.out.println("tahmin hatali,artirin biraz");

                } else if(tahminSayisi<sayi){
                    System.out.println("tahmin hatali,azaltiniz");

                }else if(sayi==tahminSayisi){
                    System.out.println("Tahmin dogru girilmistir");

                  kontrol++;
                    System.out.println(kontrol+"kez tahmin ettiniz");
                    break;
                }

             }

        }
}
