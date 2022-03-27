package day24_Lists;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("yusuf");
        isimler.add("ilker");
        isimler.add("oguzhan");
        System.out.println(isimler);

        isimler.set(1,"Seckin");

        System.out.println(isimler);
        // daha once de listede olanlari da arsiv gibi tutumak istersek
        List<String>logListesi=new ArrayList<>();
        logListesi.add(isimler.set(2,"cosmos"));
        System.out.println(isimler);
        System.out.println(logListesi);
    }
}
