package unit7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args){
        System.out.println("1、将数组转成集合");
        System.out.println("-------------------");
        List<Integer> list = Arrays.asList(87, 67, 65, 544);

        for (Integer i : list){
            System.out.println(i);
        }

        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("java");
        a1.add("javase");
        a1.add("php");
        a1.add("ruby");
        a1.add("android");

        String[] str = a1.toArray(new String[a1.size()]);
        System.out.println(Arrays.toString(str));
    }
}
