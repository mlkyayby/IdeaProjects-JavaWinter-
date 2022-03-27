package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

import static day25_ArrayList.C04_ListedenTekrarliElementleriSilme.tekrarsizListeOlustur;

public class C05_ListTekrarsizYap {
    public static void main(String[] args) {
        // verilen bir listede tekrar eden sayilari sadece bir tane yapan bir method olusturun
        // orn:[1, 3, 5, 3, 5, 6, 1, 7]
        // output[1, 3, 5, 6, 7] bu hale donusturun


        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        tekrarsizListeOlustur(sayilar);

    }
}
