package day33_varargs_stringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {

        // compaire iki sb i ilk harften baslayarak tum karakterleri karsilastirir
        //Ayni olan karakterler icin bir sey yazdirmaz
        //farkli olan karakter icin kac ascii tablosuna gore geride vya ileride oldugunu yazdirir
        // tamamen ayni ise bize 0 dondurur
        // bir stringbuilder ile bir stringi compaire etmek istersek java CTE verir

        StringBuilder sb1=new StringBuilder("Ali Can");
        StringBuilder sb2=new StringBuilder("Ali can");

        String str="Ali Can";

       // System.out.println(sb1.compareTo(sb2));
       // strunbuilder de  equals methodu string deki == gibi calisir
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.equals(sb1));
        System.out.println(sb1.equals(str));//false

        //System.out.println(sb1==str);// farkli obje turleri old icin java kiyas yapmaz


    }
}
