package Array;

public class maxConsecutive {
    static int findMaxConsecutive(int[] arr){
        int count = 0;
        int maxi = 0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i] == 1){
                count++;
            }
            else {
                count = 0;
            }
            maxi = Math.max(maxi,count);
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0,0,1,1,0};
        int ans = findMaxConsecutive(arr);
        System.out.println("The maximum consecutive one's are: "+ans);
    }
}
