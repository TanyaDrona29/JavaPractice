package JavaPractice.dsquestion;

import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of elements of array");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.println("enter array elements:");
             arr[i] = scanner.nextInt();
        }
        //original array
        System.out.println("original array:");
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        //wave array
        for (int i = 0; i < arr.length-1; i = i + 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        //printing the wave array
        System.out.println("wave array is:");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
