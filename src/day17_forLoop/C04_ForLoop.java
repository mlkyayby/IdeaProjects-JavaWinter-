package day17_forLoop;

public class C04_ForLoop {
    public static void main(String[] args) {
        for (int i = 10; i <=29; i++) {
            System.out.print(i+",");

        }
        System.out.println(30);

      int baslangic=10;
      int bitis=20;
        for (int i = 0; i <=bitis;i++) {

            if(i<bitis){
                System.out.print(i+",");
            }else{
                System.out.println(i);
            }

        }
    }
}
