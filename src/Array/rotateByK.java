package Array;

public class rotateByK {
    static void printArray(int [] a){
        for (int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    static void reverse(int [] a,int st,int end){
        while (st<end){
            int temp = a[st];
            a[st] = a[end];
            a[end] = temp;
            st++;
            end--;
        }
    }
    static void rotateRight(int[] a,int k) {
        int n = a.length;
        k = k%n;
        reverse(a,0,n-1);
        reverse(a,0,k-1);
        reverse(a,k,n-1);
    }
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7};
        int k = 10;
        rotateRight(a,k);
        printArray(a);
    }
}
