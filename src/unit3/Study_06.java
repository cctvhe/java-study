package unit3;

import java.util.Arrays;

public class Study_06 {

    public static void main(String[] args){
        int[] numbers = new int[5];
        for (int i=0; i<numbers.length;i++){
            numbers[i]=i+1;
        }

        //请注意，在使用这种语法时不需要使用new
        int[] numbers2 = {2, 3, 5, 6, 11, 13};
        System.out.println(Arrays.toString(numbers2));

        //甚至还可以初始化一个匿名数组
        int[] numbers3  = new int[] {2,23,22,2,23};
        System.out.println(Arrays.toString(numbers3));


    }
}
