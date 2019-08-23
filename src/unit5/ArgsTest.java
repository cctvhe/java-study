package unit5;

import java.util.Optional;

public class ArgsTest {
    public static void main(String[] args){
        Demo d = new Demo();
        int result = d.sum(11, 22);
        System.out.println(result);
        System.out.println("--------------");

        StudentDemo sd = new StudentDemo();
        Student s = new Student();
        sd.method(s);

    }
}

class Demo{
    public int sum(int a, int b){
        return a+b;
    }
}

class Student{
    public void show(){
        System.out.println("我爱学习");
    }
}

class StudentDemo{
    public void method(Student s){
        s.show();
    }
}