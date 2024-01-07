package Array;

public class SecondSmla {
    static int secondSmallest(int [] a){
        int n = a.length;
        if(n<2){
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int i;
        for (i = 0;i<n;i++){
            if (a[i]<small){
                second_small = small;
                small = a[i];
            }
            else if (a[i]<second_small && a[i]!= small) {
                second_small = a[i];
            }
        }
        return second_small;
    }
    static int secondLargest(int[] a) {
        int n = a.length;
        if(n<2)
            return -1;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
        {
            if (a[i] > large)
            {
                second_large = large;
                large = a[i];
            }

            else if (a[i] > second_large && a[i] != large)
            {
                second_large = a[i];
            }
        }
        return second_large;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        int n = arr.length;
        int sS = secondSmallest(arr);
        int sL = secondLargest(arr);
        System.out.println("Second smallest is "+sS);
        System.out.println("Second largest is "+sL);
    }
}
