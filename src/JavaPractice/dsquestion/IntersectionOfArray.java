package JavaPractice.dsquestion;

import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfArray {

    static void printIntersection(int arr1[], int arr2[]) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr1.length; i++)
            hashSet.add(arr1[i]);
        for (int i = 0; i < arr2.length; i++) {
            if (hashSet.contains(arr2[i]))
                System.out.print(arr2[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size of first array");
        int size1 = scanner.nextInt();
        int array1[] = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("enter element of first array");
            array1[i] = scanner.nextInt();
        }

        System.out.println("enter size of second array");
        int size2 = scanner.nextInt();
        int array2[] = new int[size2];
        for (int i = 0; i < array2.length; i++) {
            System.out.println("enter element of second array");
            array2[i] = scanner.nextInt();
        }

        System.out.println("Intersection of two arrays is : ");
        printIntersection(array1,array2);

    }
}
