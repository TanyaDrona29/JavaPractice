package JavaPractice.dsquestion;

import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter");
        String string = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}

