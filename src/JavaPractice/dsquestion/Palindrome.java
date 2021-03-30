package JavaPractice.dsquestion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("enter");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String reverse = new StringBuilder(string).reverse().toString();
        if (string.equals(reverse)){
            System.out.println("Yes, it is a palindrome");
        }
        else{
            System.out.println("No, it is not a palindrome");
        }
    }
}
