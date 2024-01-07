package Array;

public class moveZeroes {
    static void printArray(int [] a){
        for (int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    static int [] moveZeroesAtEnd(int []a){
        //for finding first zero
        int j =-1;
        for(int i =0;i<a.length;i++){
            if(a[i] == 0){
                j=i;
                break;
            }
        }
        if(j == -1) return a;
        for (int i =j+1;i<a.length;i++){
            if (a[i]!=0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        return a;
    }
    public static void main(String[] args) {
            int [] a = {1,2,3,0,0,9,10,0,4,11,0};
            int [] ans = moveZeroesAtEnd(a);
            printArray(ans);
    }
}
