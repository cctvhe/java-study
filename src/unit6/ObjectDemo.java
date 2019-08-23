package unit6;

class Person{
    private int age;
    Person(int age){
        this.age = age;
    }

    public boolean equals(Object obj){
        if(! (obj instanceof Person))
            throw new ClassCastException("类型错误");

        Person p = (Person)obj;
        return this.age == p.age;
    }
}

public class ObjectDemo {
    public static void main(String[] args){
        Person p1 = new Person(20);
        Person p2 = new Person(20);

        System.out.println(p1.equals(p2));
    }

}
