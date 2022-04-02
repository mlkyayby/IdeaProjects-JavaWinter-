package day33_varargs_stringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder("Java cok guzeldir");
        StringBuilder sb3=new StringBuilder(10);

        System.out.println("sb1 lenght:"+sb1.length());
        System.out.println("sb1 capacity:"+sb1.capacity());

        System.out.println("sb1 lenght:"+sb2.length());
        System.out.println("sb1 capacity:"+sb2.capacity());

        System.out.println("sb1 lenght:"+sb3.length());
        System.out.println("sb1 capacity:"+sb3.capacity());

        //append methodu ile sb ye ekleme yapabiliriz

        sb1.append("Java").append(" ").append("cok").append(" ").append("guzel");
        System.out.println("sb1 lenght:"+sb1.length());
        System.out.println("sb1 capacity:"+sb1.capacity());

        sb1.append(3);
        System.out.println(sb1);
        sb1.append(true);
        System.out.println(sb1);

        System.out.println("sb1 lenght:"+sb1.length());
        System.out.println("sb1 capacity:"+sb1.capacity());

        sb1.append("tum dersler Java olsa");

        System.out.println("sb1 lenght:"+sb1.length());
        System.out.println("sb1 capacity:"+sb1.capacity());

        sb1.trimToSize();

        System.out.println("sb1 lenght:"+sb1.length());
        System.out.println("sb1 capacity:"+sb1.capacity());

    }
}
