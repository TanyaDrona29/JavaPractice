package JavaPractice.dsquestion;

public class TrappingRainWater {
    //total water that is trapped in between the buildings
    public static int totalWater(int[] arr, int n){
        int total = 0;
        for (int i = 1; i <n-1 ; i++) {
            int left_max = findLeftMax(arr,n,i);
            int right_max = findRightMax(arr,n,i);
            total = total + Math.min(left_max,right_max)-arr[i];
        }
        return  total;
    }
    //finding the maximum element in left side
    public static int findLeftMax(int[] arr, int n, int i){
        int max =arr[i];
        for (int j = 0; j <i ; j++) {
            max = Math.max(max,arr[j]);
        }
        return max;
    }
    //finding maximum element in the right side
    public static int findRightMax(int[] arr, int n, int i){
        int max =arr[i];
        for (int j = i+1; j <n ; j++) {
            max =Math.max(max,arr[j]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int n =  arr.length;
        int result = totalWater(arr,n);
        System.out.println(result);
    }
}
