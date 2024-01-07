package Array;
public class LargestElement {
    static int findLargest(int [] a){
        int n = a.length;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if (a[i]>max){
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
            int [] a = {1,6,2,17,9,10};
            int maximum = findLargest(a);
            System.out.println(maximum);
    }
}
