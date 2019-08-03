package unit3;

public class Study_05 {

    public static void main(String[] args){
//        int[] a = new int[100];
//        for(int i = 0; i<100; i++)
//            a[i] = i;

        if(args[0].equals("-h")){
            System.out.println("hello");
        }else if(args[0].equals("-g")){
            System.out.println("good");
        }

        for(int i=1; i<args.length; i++){
            System.out.println(" " + args[i]);
        }
    }
}
