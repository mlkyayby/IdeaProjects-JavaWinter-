package day24_Lists;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(5);//[5]
        sayilar.add(3);
        sayilar.add(0,7);
        sayilar.add(2,7);
        sayilar.remove(3);
        //sayilar.remove(5);//indexoutofboundexception

       // int sayi=5;
       // sayilar.remove(sayi);//indexoutofboundexception

        Integer sayi=5;
        sayilar.remove(sayi);
        System.out.println(sayilar);


    }
}
