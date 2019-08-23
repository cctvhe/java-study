package unit4;

public class ArrayTest2 {
    public static void main(String[] args){
        int[] arr = {34,98,10,25,67};

//        int max = arr[0];
//        for(int i=0; i<arr.length;i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//        System.out.println(max);

        int max = getMax(arr);
        System.out.println(max);

        int min = getMin(arr);
        System.out.println(min);
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i=0; i<arr.length; i++){
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
