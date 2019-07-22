/**
 * 变量
 */
package unit3;

public class Study_04 {
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
        System.out.println(nx);


        int nx2 = (int) Math.round(x1);
        System.out.println(nx2);
    }
}
