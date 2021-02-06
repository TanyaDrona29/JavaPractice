package JavaPractice.Knapsack;

public class Memoization {                                               //max function to find out the maximun value
    static int max(int a, int b){
        return(a>b)?a:b;
    }
    static int knapsack(int[] weight, int[] value, int bag , int arraysize){
        int matrix[][] = new int[arraysize+1][bag+1];
        for (int i = 0; i <arraysize; i++) {                         //initialize matrix with -1
            for (int j = 0; j <bag ; j++) {
                matrix[i][j]= -1;
            }
        }
        //check if either bag capacity is zero or if array is empty
        if(arraysize ==0 || bag == 0){
            return 0;
        }
        if(matrix[arraysize][bag] !=0){
            return matrix[arraysize][bag];
        }
        if(weight[arraysize-1]<=bag){
            return matrix[arraysize][bag]= max(value[arraysize-1]+knapsack(weight,value,bag-weight[arraysize-1],arraysize-1),
                    knapsack(weight,value,bag,arraysize-1));
        }
        else
            return matrix[arraysize][bag]= knapsack(weight,value,bag,arraysize-1);
    }
    public static void main(String[] args) {

        int[] weight = {1, 2, 3, 5};
        int[] value = {2,3,4,5};
        int bag= 6;
        int arraysize = weight.length;
        System.out.println("max profit is:"+knapsack(weight,value, bag,arraysize));
    }


}

