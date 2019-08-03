/**
 * 变量
 */
package unit3;

import javax.sql.rowset.spi.SyncProvider;

public class Study_04 {
    /**
     * 枚举类型
     */
    enum Size {
        SMALL, MEDIUM, LARGE, EXTRA_LARGE
    };

    public static void main(String[] args){
        //变量初始化
        //志明一个变量之后，必须用赋值语句进行变量显式初始化，千万不要使用未初始化变量
        int vacationDays;
        vacationDays = 12;
//        System.out.println(vacationDays);

        //常量
        final double CN_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
//        System.out.println("CN_PER_INCH" + CN_PER_INCH + " paperWidth" + paperWidth + " paperHeight" + paperHeight);

        //运算符
        int n=12;
        n++;
//        System.out.println(n);

        //数学函数与常量
        double x=4;
//        double y=Math.sqrt(x);
        double y =Math.pow(x, 3);
//        System.out.println(y);

        //强制类型转换
        /**
         * 如果两个操作数中一个是double类型，另一个操作数会转换为double类型
         * 如果一个操作数是float，另一个操作数会转换为float
         * 如果一个操作数是long类型，另一个操作数会转换为long
         */
        double x1 = 9.997;
        int nx = (int) x1;
//        System.out.println(nx);


        int nx2 = (int) Math.round(x1);
//        System.out.println(nx2);

        //枚举
        Size s = Size.EXTRA_LARGE;
//        System.out.println(s);

        //字串
        String greeting = "hello";
        String s2 = greeting.substring(0, 3);
//        System.out.println(s2);

        //检查字符串是否相等(区分大小写)
        String s3 = "abc";
        String s4 = "Abc";
//        System.out.println(s3.equals(s4));

        //检查字符串是否相等（不区分大小写）
//        System.out.println(s3.equalsIgnoreCase(s4));


        //空串与NULL串
        if(s3.length() == 0){

        }
        if(s4.equals("")){

        }

        //获取字符长度
        System.out.println(s3.length());

        //实际长度,代码点数量
        System.out.println(s3.codePointCount(0, s3.length()));

        //返回指定位置代码单元
        System.out.println(s3.charAt(0) + " " +  s3.charAt(2));
    }
}
