package JavaPractice.dsquestion;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of row for matrix");
        int row = sc.nextInt();
        System.out.println("enter number of cloumns for matrix");
        int column = sc.nextInt();
        int matrix[][] = new int[row][column];
        for (int i = 0; i <row ; i++) {                       //creating matrix
            for (int j = 0; j <column ; j++) {
                System.out.println("enter the element of martix");
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <row ; i++) {                      //printing matrix
            for (int j = 0; j <column ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("enter the element to be searched for");
        int search = sc.nextInt();
        boolean found = false;
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                if(matrix[i][j]== search){
                    found = true;
                }
            }
        }
        System.out.println(found);
    }
}
