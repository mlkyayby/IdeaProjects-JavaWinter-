package day25_ArrayList;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {
        //verilen bir arraydan istenen elementi(kac tane varsa) silip kalanlari
        //yeni bir array olarak yazdiran bir method olusturun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenEleman=3;

        istenmeyenElemantiSil(arr,istenmeyenEleman);


    }

    private static void istenmeyenElemantiSil(int[] arr, int istenmeyenEleman) {

        //1 istenmeyen elementi sayisini bulalim
        //2 yeni array olustur
        //3 eski arraydan uygun elementleriyeniye tasi ve yazdir

        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==istenmeyenEleman){
                sayac++;

            }

        }
       //yeni array i olusturalim
        int arrYeni[]=new int[arr.length-sayac];
        //3 eski arraydan uygun elementleri yeniye tasi
        int index=0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=istenmeyenEleman){

             arrYeni[index]=arr[i];
             index++;
            }
        }

        // 4yeni arrayi yazdiralim
        System.out.println(Arrays.toString(arrYeni));


    }
}
