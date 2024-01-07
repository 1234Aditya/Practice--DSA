package Array;

import java.util.HashSet;

public class removeDuplicate {
    static int removeDuplicate1(int[] arr){
        HashSet <Integer> set = new HashSet<>();
        for (int i = 0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x : set){
            arr[j++] = x;
        }
        return k;
    }
    static int removeDuplicate(int[] a){
        int i = 0;
        for (int j =1;j<a.length;j++){
            if(a[i]!=a[j]){
                i++;
                a[i] = a[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int [] a = {0,0,0,1,1,2,2,3,4,4,5};
//        int k = removeDuplicate1(a);
        int k = removeDuplicate(a);
        System.out.print("The array after removing the duplicates: ");
        for (int i =0;i<k;i++){
            System.out.print(a[i]+" ");
        }
    }
}
