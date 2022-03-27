package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {
        String str="Java ile IT cok guzel";
        System.out.println(str.substring(5));//ile IT cok guzel
        //yukaridaki Stringi'i mehmet hoca ile IT cok guzel
        System.out.println(str.replace("Java","Mehmet hoca"));
        System.out.println(str.substring(9));//yazilan index inclusive

        System.out.println(str.substring(0,5));
        System.out.println(str.substring(0,1));
        String harf=str.substring(5,6);
        System.out.println(harf);

        str="Java gun gectikce guzellesiyor";
        System.out.println(str.substring(7,7));//hiclik dondurur

        System.out.println(str.substring(5,2));//bitis index i baslangic index den kucuk olamaz
        System.out.println(str.substring(str.length()-1));
        System.out.println(str.substring(str.length()-5));//son 5 harfi yazdiralim


    }
}
