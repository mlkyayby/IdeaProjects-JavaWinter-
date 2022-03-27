package day19_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        //kullanicidan pozitif bir tam sayi alip while
        // loop ile 5 ten kucuk  sayilari yazdiralim

        int input=5;
        int sayi=1;
        int sayac=1;

        while(sayi<input){
            System.out.println(sayi);
            sayac++;
            sayi++;
        }
        System.out.println("sayac:"+sayac);


        // ayni soruyu do-while loop la yapalim

        sayi=1;
        do{
            System.out.println();
            sayi++;

        } while(sayi<input);

    }
}
