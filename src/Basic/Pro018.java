package Basic;

public class Pro018 {
    public static void main(String[] args) {

        //Write a program to reverse an array.

        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("Reverse Array is ::");
        for (int i=0; i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
