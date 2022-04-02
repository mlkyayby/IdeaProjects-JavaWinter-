package day30_passByValue;

public class C01_StaticBlocks {

    // static blok ilk calismaya basladiginda devreye gire ve classin calismasi icin gerekli on
    //hazirliklar icin kullanilir
    // yazildigi sqatirin hic bir monemi yoktur class icerisinde
    // static blok birden fazla olursa bloklar yukardan asagiyadogru calisir
    static {
        System.out.println("static blok calisti");

    }
    C01_StaticBlocks(){
        System.out.println("constructor calisti");
    }
    public static void main(String[]args){
        System.out.println("main method baslangici");
        C01_StaticBlocks obj1;
        System.out.println("main method sonu");
    }

}
