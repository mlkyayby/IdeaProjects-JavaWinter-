package day02_Variables;

public class C01_variables {
    public static void main(String[] args) {

        // Java calismaya main method'dan baslar
        // sonra yukaridan asagi, soldan saga dogru calisir
        // eger istersek bir variable'i once declare edip sonra deger atayabiliriz
        String okulIsmi;
        // Java deger atamasi yapmadigimiz bir variable olusturmamiza itiraz etmez
        // ancak deger atamasi yapincaya kadar o variable'i kullanmamiza izin vermez
        // System.out.println(okulIsmi);
        okulIsmi="Yildiz Koleji";
        System.out.println(okulIsmi); // Yildiz Koleji
        okulIsmi="Star Koleji";
        System.out.println(okulIsmi); // Star Koleji

    }
}
