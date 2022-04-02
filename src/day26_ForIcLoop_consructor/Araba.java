package day26_ForIcLoop_consructor;

public class Araba {

    /* Javada her class olusturdugumuzda
    ve biz ozellikle belirtmesekte java her olusturdugu class a bir constructor koyar
  Java nin class olustururken class a koydugu contructor a DEFAULT CONTSRUCTOR denir ve bu constructor gorunmez

  Eger biz gorunur bir constructor imiz olsun istersek default constructor ile ayni gorevi yapan bir consructor olusturabilririz
            veya istersek ayni kaliptan farkli desenlerde objeler olusturmak icin
            farkli ozelliklerde constructorlar da olusturabiliriz


            constructor lari birbirirnden farklilastiran tek ayricalik kullanilan parametre sayisi ve parametre data turudur
              ozetle : constructorin adi class adi ile ayni olmali ve
                        return type'i olmamali
             */
    public Araba() {
        System.out.println("parametresiz constructor calisti");
        // bir kod blogunun method veya constructor olmasindan emin olmak istiyorsaniz
        //iki seye dikkat etmelisiniz

        // 1 constructorlarin ismi nclass ismi ile ayni olmak zorundadir yani buyuk harfle baslar
        // 2 constructorlarin return type olmaz olursa method olur
        // constructorlarin adi class adi ile ayni olmali

    }

    public Araba(String renk) {
            System.out.println(renk + " renkli bir araba uretildi");
        }


}