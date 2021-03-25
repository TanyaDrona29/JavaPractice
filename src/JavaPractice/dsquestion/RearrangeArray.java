package JavaPractice.dsquestion;

public class RearrangeArray {
    public static void main(String[] args) {
        int array[] = {-12,-11,8,0,1,-10,7};
        int n = array.length;
        int j =0;
        for (int i = 0; i <n ; i++) {
            if(array[i]<0){
                if (i != j){
                 int temp = array[i];
                 array[i]= array[j];
                 array[j]= temp;
                }
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
