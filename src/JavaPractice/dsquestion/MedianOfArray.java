package JavaPractice.dsquestion;

import java.util.Scanner;

public class MedianOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of elements of array");
        int n = scanner.nextInt();
        int array[] = new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.println("enter element of array");
             array[i] = scanner.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
         if (n%2!=0){
           System.out.println("median is " + array[n/2]);
       }
        else{
            float sum = array[n/2] + array[(n/2 +1)];
            float median = sum/2;
            System.out.println("median is " + median);
        }
    }
}
