package day22_arrays;

import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {
         // verilen bir array da istenen bir elementin olup olmadigini gostern bir method olusturun

        int arr[]={3,5,6,9,45,25,4,9,0};
        int istenenSayi=9;

        istenenElemanVarMi(arr,istenenSayi);



    }

    private static void istenenElemanVarMi(int[] arr, int istenenSayi) {
        boolean sonuc=false;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==istenenSayi){

                System.out.println("true");
                sonuc=true;
                break;
            }

        }
        System.out.println("sonuc");

    }
}
