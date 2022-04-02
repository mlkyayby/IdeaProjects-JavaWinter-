package day33_varargs_stringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Yasasin Java");
        sb1.indexOf("Java");

        System.out.println(sb1.indexOf("Java"));

        System.out.println(sb1.lastIndexOf("s"));
        System.out.println(sb1.indexOf("s"));
        System.out.println(sb1.replace(0,7,"Ne guzel"));
        System.out.println(sb1);

        System.out.println(sb1.toString().toUpperCase());
        System.out.println(sb1);
        System.out.println(sb1.delete(0,3));

        System.out.println(sb1.deleteCharAt(5));
    }
}
