package day33_varargs_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {
        // Parametre olarak bir integer ve istedigimiz kadar string alan 
        // en uzun kelimenin harf sayisi iler integer
        //parametre degerini carpip sonucu yazdiran bir method olusturun
        
        int sayi=5;
        String str1="Zulal";
        String str2="Zeynep";
        String str3="Zeynep";

        
        carpim(sayi,str1,str2,str3);

        //Bir method ta varargs disinda parametre kullanacaksak
        // once diger parametreleri yazip, varargs i en sona yazmaliyiz
        // bu sebeple bir method ta birden fazla varargs olamaz
    }

    private static void carpim(int sayi, String... str) {
       String enUzunStr="";
        for (String each:str
        ) {
            if (each.length()>enUzunStr.length()){
                enUzunStr=each;
            }
        }
        System.out.println("istenen deger:"+sayi* enUzunStr.length());
    }
}
