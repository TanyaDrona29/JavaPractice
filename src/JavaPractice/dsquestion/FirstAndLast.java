package JavaPractice.dsquestion;

public class FirstAndLast {
    public static void findLastAndFrist(int arr[], int x){
        int n = arr.length;
        int first = -1;
        int last = -1;
        for(int i =0; i<n; i++){
            if(x != arr[i]){
                continue;
            }
            if (first == -1)
                first = i;
            last = i;
        }
        if (first != -1){
            System.out.println("first: "+ first);
            System.out.println("last: "+ last);
        }
        else {
            System.out.println("not found ");
        }
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,3,2,3,2,3,2,3,3,5,2,5};
        int number = 2;
        findLastAndFrist(array,number);
    }
}
