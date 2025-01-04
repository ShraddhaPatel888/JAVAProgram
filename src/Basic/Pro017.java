package Basic;

public class Pro017 {

    // Write a program to find the largest and smallest element in an array.

    public static void main(String[] args) {

        int[] arr = {12, 3, 7, 1, 9};
        int max = arr[0], min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Max: " + max + ", Min: " + min);

    }
}
