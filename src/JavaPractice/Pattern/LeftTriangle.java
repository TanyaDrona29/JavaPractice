package JavaPractice.Pattern;

import java.util.Scanner;

public class LeftTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size");
        int size = scanner.nextInt();
        for (int i = 1; i <=size ; i++) {
            for (int j =1; j<=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
