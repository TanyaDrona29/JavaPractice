package JavaPractice.dsquestion;

public class KthMaxAndMinOfArray {
    public static void main(String[] args) {
        int array[] = {21,34,78,93,1,8,5,2,10,37,45,16};
        int k = 4;
        int n=array.length;
        for (int i = 0; i <n; i++) {
            for (int j = i+1; j <n; j++) {
                if(array[i]>array[j]){
                    int temp =array[j];
                    array[j]= array[i];
                    array[i]=temp;
                }
            }
        }
        System.out.println(k+"th minimum element is "+array[k-1]);
        System.out.println(k+"th maximum element is "+array[array.length-k]);
    }
}
