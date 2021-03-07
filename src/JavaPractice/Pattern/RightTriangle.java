package JavaPractice.Pattern;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size");
        int size = scanner.nextInt();
        for (int i =1; i<=size+1; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("  ");
            }
            for (int j =0; j <size-i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
