package unit4;

public class ForForDemo3 {
    public static void main(String[] args){
        for(int x=0; x<9; x++) {
            for(int y=0; y<=x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------");

        //为了使用数据，我们从1开始
        for(int x=1; x<=9; x++) {
            for(int y=1; y<=x; y++) {
                System.out.print(y+"*"+x+"="+y*x+"\t");
            }
            System.out.println();
        }
    }
}
