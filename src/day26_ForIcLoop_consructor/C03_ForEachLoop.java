package day26_ForIcLoop_consructor;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        /*
        * iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
         Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
        * */


        String array1[]={"Ali","Ayse","can","Fatma"};
        String array2[]={"can","evren","emsal","fatma","Emre"};

        List<String>ortakElemanlar=new ArrayList<>();
        for (String each1:array1
             ) {
            for (String each2:array2
                 ) {
                if (each1.equals(each2)){
                    ortakElemanlar.add(each1);
                }
            }
        }
    }
}
