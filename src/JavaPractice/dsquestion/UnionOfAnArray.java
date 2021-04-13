package JavaPractice.dsquestion;
import java.util.HashSet;
import java.util.Scanner;

public class UnionOfAnArray {
    static void printUnion(int arr1[], int arr2[]) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++)
            hs.add(arr1[i]);
        for (int i = 0; i < arr2.length; i++)
            hs.add(arr2[i]);
        System.out.println(hs);
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

        System.out.println("Union of two arrays is : ");
        printUnion(array1,array2);
    }
}
