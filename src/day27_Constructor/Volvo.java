package day27_Constructor;

public class Volvo {
    String marka="Volvo";
    String mennsei="Isvec";
    String model;
    boolean elektrikliMi;
    int yil;
    String yakit;
    boolean tomatikPilot=otomatikPilotSorgusu();
    int maxHiz=maxHizAta();


    public Volvo(){

    }

    public Volvo(String xc60, boolean b, int i, String benzin) {
    }

    public int maxHizAta() {
        int maxHiz=0;
        if(elektrikliMi){
            maxHiz=160;
        }else{
            maxHiz=240;
        }
        return maxHiz;
    }

    public boolean otomatikPilotSorgusu() {
        boolean sonuc=false;
        if(elektrikliMi){
            sonuc=true;
        }else{
            sonuc=false;
        }
        return sonuc;
    }
    public String toString(){
        String arabaOzellikleri=" model:"+model+
                " yakit"+yakit+" maxHiz"+maxHiz;


        return arabaOzellikleri;
    }
}
