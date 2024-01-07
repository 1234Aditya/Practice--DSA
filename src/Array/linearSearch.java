package Array;

public class linearSearch {
    static int linearSearch(int [] a,int n){
        int l = a.length;
        for (int i = 0;i<l;i++){
            if(a[i]==n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
            int [] a = {1,2,3,4,5,6,7};
            int ans = linearSearch(a,6);
            System.out.println("The element is present at index: "+ans);
    }
}
