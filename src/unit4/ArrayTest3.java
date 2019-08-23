package unit4;

public class ArrayTest3 {
    public static void main(String[] args){
        int[] arr = {12,98,50,34,76};
        printArray(arr);
    }

    public static void printArray(int[] arr){
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
