package JavaPractice.dsquestion;

public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {20,10,50,40,80,60};
        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i]= array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
