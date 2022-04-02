package day33_varargs_stringBuilder;

public class C06_StrinBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Pirize dikkat");

        System.out.println(sb1.insert(13,"edin."));

        String str="Hayatta cok guzel seyler var";
        System.out.println(sb1.insert(0,str,0,8));

        System.out.println(sb1.reverse());

        System.out.println(sb1.reverse());

        System.out.println(sb1.substring(3,5));

        System.out.println(sb1);

        System.out.println(sb1.subSequence(3,5));
        System.out.println(sb1);


    }
}
