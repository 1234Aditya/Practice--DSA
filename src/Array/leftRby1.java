package Array;

public class leftRby1 {
    static void solve(int [] a){
        int n = a.length;
        int temp = a[0];
        for (int i = 0;i<n-1;i++){
            a[i] = a[i+1];
        }
        a[n-1] = temp;
        for (int i =0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        solve(a);
    }
}
