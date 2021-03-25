package JavaPractice.dsquestion;

public class NoOfRotations {
    public static void main(String[] args) {
        int array[] = {4,5,6,1,2,3};
        int min =0;
        for (int i = 0; i <array.length-1 ; i++) {
            if(array[i+1]<array[i]){
                min = i;
                break;
            }
        }
        System.out.println(min);
    }
}
