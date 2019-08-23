package unit4;

import java.util.Scanner;

public class CharacterTest {
    public static void main(String[] args){
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串");
        String line = sc.nextLine();

        char[] chs = line.toCharArray();
//        System.out.println(chs);

        for (int i = 0; i<chs.length; i++){
            char ch = chs[i];
            if(Character.isUpperCase(ch)){
                bigCount++;
            }else if(Character.isLowerCase(ch)){
                smallCount++;
            }else if(Character.isDigit(ch)){
                numberCount++;
            }
        }

        System.out.println("大写字母：" + bigCount + "个");
        System.out.println("小写字母：" + smallCount + "个");
        System.out.println("数字字符：" + numberCount + "个");
    }
}
