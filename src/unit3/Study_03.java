/**
 * 数据类型   8种
 * 整形       4种                存储需要
 *                   int        4字节
 *                   short      2字节
 *                   long       8字节
 *                   byte       1字节
 * 符点类型   2种                存储需要
 *                  float       4字节
 *                  double      8字节
 * char类型   1种
 * bool类型   1种
 */
package unit3;

public class Study_03 {

    public static  void main(String[] args){
        String str = "a你好啊123abc";

        /**
         * char charAt(int index)
         * 返回给定位置的代码单元，除非对底层代码感觉兴趣，否则不需要调用这个方法
         */
        System.out.println("charAt:" + str.charAt(3));

        /**
         * 2
         * int codePointAt(int index) 5.0
         * 返回从给定位置开始或结束的Unicode代码点
         */
        System.out.println("codePointAt:" + str.codePointAt(0));

        /**
         * 3
         * int offsetByCodePoints(int startIndex, int cpCount) 5.0
         * 返回从startIndex代码点开始，位移cpCount后的代码点索引
         */
//        System.out.println(str.offsetByCodePoints(0, 100));

        /**
         * 4
         * int compareTo(String other)
         * 按照字典顺序，
         * 如果字符串位于other之前，返回一个负数，
         * 如果字符串伴于other之后，返回一个正数，
         * 如果字符串相等返回0
         */
        String a = "bssdf";
        String b = "bdd";
        System.out.println("compareTo:" + a.compareTo(b));

        /**
         * 5
         * boolean endsWith(String suffix)
         * 如果字符串以suffix结尾，返回true
         */
        String strSuffix = "c";
        System.out.println("endsWith:" + str.endsWith(strSuffix));

        /**
         * bool equals(Object other)
         * 如果字符串与other相等，返回true
         */
        String equals_str1 = "aaa";
        String equess_str2 = "aaa";
        System.out.println("equals:"+equals_str1.equals(equess_str2));

        /**
         * boolean equalsIgnoreCase(String other)
         * 如果字符串与other相等（忽略大小写），返回true
         */
        String equalsIgnoreCase_str1 = "abc";
        String equalsIgnoreCase_str2 = "AbC";
        System.out.println("equalsIgnoreCase:"+ equalsIgnoreCase_str1.equalsIgnoreCase(equalsIgnoreCase_str2));

        /**
         * int indexOf(int ch): 返回指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。
         * int indexOf(int ch, int fromIndex): 返回从 fromIndex 位置开始查找指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。
         * indexOf(String str): 返回指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。
         * indexOf(String str, int fromIndex): 返回从 fromIndex 位置开始查找指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。
         */
        String indexof_str = "aaa456ac";
        System.out.println("indexOf(String str) :" + indexof_str.indexOf("b"));//查找指定字符是在字符串中的下标。在则返回所在字符串下标；不在则返回-1.
        System.out.println("int indexOf(int ch) :" + indexof_str.indexOf(99));
        System.out.println("indexOf(String str) :" + indexof_str.indexOf("c"));
        System.out.println("int indexOf(int ch, int fromIndex) :" + indexof_str.indexOf(99, 3)); //从第四个字符位置开始往后继续查找，包含当前位置

        /**
         * int length()
         * 返回字符串的长度
         */
        String length_str = "adfafafd";
        System.out.println("length:" + length_str.length());

        /**
         * String toLowerCase()
         * 返回一个新字符串，将所有的大写字母改成小写字母
         */
        String toLowerCase_str = "abcAdE";
        System.out.println("toLowerCase:" + toLowerCase_str.toLowerCase());

        /**
         * String toUpperCase()
         * 返回一个新字符串，将所有的小写字母改成大写字母
         */
        System.out.println("toUpperCase:" + toLowerCase_str.toUpperCase());

        /**
         * String trim()
         * 返回一个新字符串，这个字符串将删除了原始字符串头部和尾部的空格
         */
        String trim_str = " asdf ";
        System.out.println("trim:" + trim_str.trim());

    }
}
