package JavaPractice.Pattern;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of square");
        int size = scanner.nextInt();
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
