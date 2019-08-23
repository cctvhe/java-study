package unit5;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args){
        String line = "aababcabcdabcde";

        TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

        char[] chs = line.toCharArray();

        for (char ch : chs){
            Integer i = tm.get(ch);

            if(i ==null){
                tm.put(ch, 1);
            }else{
                i++;
                tm.put(ch,i);
            }
        }

        StringBuffer sb = new StringBuffer();
        Set<Character> set = tm.keySet();
        for (Character key:set){
            Integer value = tm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }

        String result = sb.toString();
        System.out.println(result);
    }
}
