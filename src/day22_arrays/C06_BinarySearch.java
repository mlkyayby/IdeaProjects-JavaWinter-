package day22_arrays;

import java.util.Arrays;

public class C06_BinarySearch {
    public static void main(String[] args) {
        int arr[]={3,5,6,9,45,25,4,9,0};
        int istenenSayi=-10;

        // Eger Javadan hazir BinarySearch ile yapmak isterseniz
        //once sort methodunu kullanip, sonra BinarySearch yapmaliyiz
        // binarySearch() bize istenen sayinin oldugu indexi verir
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println( Arrays.binarySearch(arr,istenenSayi));

// eger olmayan bir elemnti aratirsak
        // Java bulamadigini gostermek icin - isareti koyar
        // sonrada o sayi olsaydi siralamasi ne olacak ise o sirayi bize verir


    }
}
