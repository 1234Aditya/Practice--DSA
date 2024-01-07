package Array;

public class arraySorted {
    static boolean isSorted(int [] a){
        if(a.length < 2){
            return true;
        }
        for (int i = 1;i<a.length;i++){
            if(a[i-1]>a[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
            int [] arr = {1,2,3,4,5,6};
            boolean ans = isSorted(arr);
            System.out.println(ans);
    }
}
