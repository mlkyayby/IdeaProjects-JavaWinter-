package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        LocalTime tm =LocalTime.now();

        System.out.println(tm);//21:10:22.999520700
        int sayi =0;
        for (int i = 0; i <100000; i++) {
            sayi+=i;

        }
        LocalTime tmLooopSonrasi=LocalTime.now();
        System.out.println(tmLooopSonrasi);

        double nano1=tm.getNano();
        double nano2= tmLooopSonrasi.getNano();

        System.out.println("islem"+(nano2-nano1)+"nanosaniyede bitti");
        // ileri veya geriye gidebiliriz

        System.out.println(tm.plusMinutes(1000));
        // istersek zone id kullanarak istedigimiz bolgenin saati icinde obje olusturabiliriz

    }
}
