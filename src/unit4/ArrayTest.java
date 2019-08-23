package unit4;

public class ArrayTest {
    public static void main(String[] args){
        int[] arr = {11, 22, 33, 44, 55};

        for (int i=0; i<5; i++){
            System.out.println(arr[i]);
        }

        System.out.println("--------------------");

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,2,2,3,4,5,7,8,5,3,5,6,8,7,8,5,3,5,6,8,7,8,5,3,5,6,8,7,8,5,3,5,6,8,7,8,5,3,5,6,8};
//
//        System.out.println(arr.length);
//        System.out.println(arr2.length);

        printArray(arr);
        System.out.println("--------------------");
        printArray2(arr2);

    }

    public static void printArray(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void printArray2(int[] arr){
        System.out.print("[");
        for (int i=0; i<arr.length; i++){
            if(i == arr.length -1){
                System.out.println(arr[i] + "]");
            }else{
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
