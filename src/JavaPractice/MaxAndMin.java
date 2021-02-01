package JavaPractice;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] array = new int[5];
        int max =0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <array.length; i++) {                                   //entering values in array
            System.out.println("enter element");
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        System.out.println();
        System.out.println("original array:");
        for (int i = 0; i <array.length; i++) {                                     //printing the original array
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {                                      //finding the maximum value
            if (max < array[i]){
                max = array[i];
            }

        }
        System.out.println("max is:");                                           //printing the max number
        System.out.println(max);

        for (int i = 0; i <array.length; i++) {                                //printing the min number
            if (array[i]<min){
                min = array[i];
            }
        }
        System.out.println("min is:");
        System.out.println(min);
    }
}
