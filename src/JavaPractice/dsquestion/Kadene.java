package JavaPractice.dsquestion;

import java.util.Scanner;

public class Kadene {
    //find the maximum sum of sub array of the given array of +ve and -ve elements using kadane's algorithm
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of array");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.println("enter element");
            arr[i] = scanner.nextInt();
        }
        System.out.println("maximum sum of subarray is:"+ maxSum(arr));
    }
    //kadane algorithm
    public static int maxSum(int arr[]){
        int current_sum =0;
        int max_sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            current_sum = current_sum + arr[i];
            if(current_sum > max_sum)
                max_sum = current_sum;
            if(current_sum < 0)
                current_sum = 0;
        }
        return max_sum;
    }
}
