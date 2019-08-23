package unit4;

public class IntegerDemo {

    public static void main(String[] args){

        int number = 100;

        /**
         * intValue()
         * 以 int 类型返回该 Integer 的值
         */

        /**
         * 将字符串参数作为有符号的十进制整数进行解析
         * parseInt(String s)
         */

        /**
         * 返回一个表示指定整数的 String 对象
         * toString(int i)
         */
        Integer i = new Integer(number);
        String s3 = i.toString();
        System.out.println("s3:" + s3);

        /**
         * 返回一个表示指定的 int 值的 Integer 实例
         * valueOf(int i)
         */
        String s2 = String.valueOf(number);
        System.out.println("s2:" + s2 );

        /**
         * 返回保存指定的 String 的值的 Integer 对象
         * valueOf(String s)
         */
    }
}
