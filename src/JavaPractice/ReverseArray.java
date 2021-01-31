package JavaPractice;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i <array.length ; i++) {                              //loop for entering values to array
            System.out.println("Enter the element");
            array[i] = scanner.nextInt();
        }
        System.out.println("Original Array:");
        for (int i = 0; i <array.length ; i++) {                                 //original array
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Reversed Array:");
        for (int i = array.length-1; i >=0 ; i--) {                                     //reversed array
            System.out.print(array[i]+" ");
        }
    }
}
