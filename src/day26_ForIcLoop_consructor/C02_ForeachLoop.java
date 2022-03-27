package day26_ForIcLoop_consructor;

import java.util.ArrayList;
import java.util.List;

public class C02_ForeachLoop {
    public static void main(String[] args) {
        //10 elementli bir list olusturalim

        int arr[]={2,5,4,6,4,9,7,1,3,10};

        List<Integer> sayilar = new ArrayList<>();

        for (int each :arr
        ){
        sayilar.add(each);
        }
        System.out.println(sayilar);

        for (int each:sayilar
             ) {
            if (each%3 !=0){
                System.out.print(each+ " ");
            }
        }
    }
}
