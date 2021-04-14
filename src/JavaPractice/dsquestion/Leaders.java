package JavaPractice.dsquestion;

import java.util.Scanner;

public class Leaders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("enter");
        for (int i = 0; i <size ; i++) {
            array[i] = scanner.nextInt();
        }

        int max= array[size-1];
        System.out.println(array[size-1]);
        for (int i = size-2; i >0 ; i--) {
            if (array[i]> max){
                max = array[i];
                System.out.println(max);
            }
        }
    }
}
