package day29_StaticKeyWord;

public class C02_StaticKeyword {
    public static void main(String[] args) {
        //baska class taki static class uyelerine ulasabilmek icin sadece clasIsmi.staticUyeIsmi
        //yazmamaiz yeterlidir.
        System.out.println(C01_Static.okulTelefonu);

        C01_Static.okulTelefonu="3125474747";
        System.out.println(C01_Static.okulTelefonu);

        //baska classtaki static olmayan class uyelerine ancak
        // o classtan obje olusturarak ulasabiliriz
        // ve obje ile yapilan atamalar sadece o obje icin gecerli olur

        C01_Static obj1=new C01_Static();
        C01_Static obj2=new C01_Static();

        System.out.println(obj2.okulIsmi);// yildiz koleji
        obj2.okulIsmi="sabir koleji";
        System.out.println(obj1.okulIsmi);//yildiz koleji
    }
}
