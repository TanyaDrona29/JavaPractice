package JavaPractice.dsquestion;

public class MinAndMaxOfArray {
    public static void main(String[] args) {
        int array[] = {2,4,78,12,90,4,45,1,23};
        int min = array[0];
        int max = array[0];
        for (int i = 0; i <array.length ; i++) {
            if(array[i]>max){
                max = array[i];
            }
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("The mininum number is"+min);
        System.out.println("The maximum number is"+max);
    }
}
