package day39_overriding;

public class Araba {
    String hareket="Arabalar Teker bile hareket eder";
    String hiz="Arabalar motor gucune gore hiz yaparlar";
    String yakit="Arabalar farkli yakitlar kullanabilir";
    String marka="Arabalar uretildikleri markaya sahiptir";

    public void motor(){
        System.out.println("Arabalar farkli markalarda motor kullanirlar");
    }

    public void yakitTuketimi(){
        System.out.println("arabalar motor gucu ve yakit tururne gore yakit tuketirler");
    }

}
