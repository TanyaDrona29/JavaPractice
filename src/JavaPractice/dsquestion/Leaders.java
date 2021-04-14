package JavaPractice.dsquestion;

import java.util.Scanner;

public class Leaders {
    //WAP to print all the LEADERS in an array. An element is said to be a leader if
    //it is greater than all the elements to its right side.
    //Also, the right most element is always a leader.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = scanner.nextInt();
        int array[] = new int[size];
        //taking elements of array as input from user
        for (int i = 0; i <size ; i++) {
            array[i] = scanner.nextInt();
        }
        //since the last element is always the leader we can print it directy
        int max= array[size-1];
        //printing the last element of array
        System.out.println(array[size-1]);
        //loop to check remaining elements
        //fing the maximum element and printing then
        for (int i = size-2; i >0 ; i--) {
            if (array[i]> max){
                max = array[i];
                System.out.println(max);
            }
        }
    }
}
