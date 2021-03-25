package JavaPractice.dsquestion;

public class ReverseOfArray {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        int size = array.length;
        for (int i = size-1; i>0 ; i--) {
            System.out.print(array[i]+" ");
        }
    }
}
