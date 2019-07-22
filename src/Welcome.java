public class Welcome {

    public static void main(String[] args){
        String[] array = new String[3];
        array[0] = "hello1";
        array[1] = "hello2";
        array[2] = "hello3";

        for (String item:array
             ) {
            System.out.println(item);
        }
    }
}
