package JavaPractice.Knapsack;

public class SubsetSum {
    static boolean isSubsetSum(int array[], int size, int sum) {
        boolean matrix[][] = new boolean[sum + 1][size + 1];

        for (int i = 0; i <= size; i++)
            matrix[0][i] = true;

        for (int i = 1; i <= sum; i++)
            matrix[i][0] = false;

        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= size; j++) {
                matrix[i][j] = matrix[i][j - 1];
                if (i >= array[j - 1])
                    matrix[i][j] = matrix[i][j] || matrix[i - array[j - 1]][j - 1];
            }
        }
        return matrix[sum][size];
    }
    public static void main(String args[]) {
        int array[] = {3, 34, 4, 12, 5, 2};
        int sum =9;
        int n = array.length;
        if (isSubsetSum(array, n, sum) == true)
            System.out.println("Found a subset with given sum");
        else
            System.out.println("No subset with given sum");
    }
}
