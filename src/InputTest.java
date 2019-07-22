import java.util.Scanner;

public class InputTest {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("请输入姓名");
        String name = in.nextLine();

        System.out.print("请输入年龄");
        int age = in.nextInt();

        System.out.println("姓名:" + name+ " 年龄：" + age);
    }
}
