package Array;

public class missingNumber {
    static int missingNum1(int[] arr,int N){
        int xor1 = 0 , xor2 = 0;
        for (int i = 0;i<N-1;i++){
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i+1);
        }
        xor1 = xor1 ^ N;
        return (xor1^xor2);
    }
    static int missingNum(int[] arr){
        int n = arr.length+1;
        int total = (n*(n+1))/2;
        int sum = 0;
        for (int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        return total-sum;
    }
    public static void main(String[] args) {
        int N = 6;
        int [] arr = {1,3,4,5,6};
        int missing = missingNum1(arr,N);
        System.out.println("The missing number in array is: "+missing);
    }
}
