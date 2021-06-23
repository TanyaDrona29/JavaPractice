package JavaPractice.dsquestion;

import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void remove(int[] arr){
        //using hashset
        LinkedHashSet<Integer>hashSet = new LinkedHashSet<Integer>();
        for (int i = 0; i < arr.length ; i++) {
            hashSet.add(arr[i]);
        }
        System.out.println(hashSet);
    }
    public static void main(String[] args) {
        int array[] = {10,32,4445,121,33,10, 32,4445};
        remove(array);
    }
}
