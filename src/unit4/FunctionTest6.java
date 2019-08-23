package unit4;

public class FunctionTest6 {

    public static void main(String[] args){
        byte b1= 3;
        byte b2=4;
        System.out.println("byte:" + compare(b1, b2));

        short s1=5;
        short s2=5;
        System.out.println("short:"+compare(s1, s2));
    }

    public static boolean compare(byte a, byte b){
        System.out.println("byte");
        return a == b;
    }

    public static boolean compare(short a, short b){
        System.out.println("short");
        return a == b;
    }
}
