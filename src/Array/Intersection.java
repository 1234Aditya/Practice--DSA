package Array;

import java.util.ArrayList;

public class Intersection {
    static ArrayList<Integer> FindIntersection(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0; // pointers
        ArrayList<Integer > Intersection=new ArrayList<>(); // Intersection vector
        while (i < n && j<m) {
            if (arr1[i]<arr2[j]){
                i++;
            } else if (arr2[j]<arr1[i]) {
                j++;
            }
           else {
               Intersection.add(arr1[i]);
               i++;
               j++;
            }
        }
        return Intersection;
    }
    public static void main(String args[]) {
        int n = 10, m = 7;
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> Union = FindIntersection(arr1, arr2, n, m);
        System.out.println("Intersection of arr1 and arr2 is ");
        for (int val: Union)
            System.out.print(val+" ");
    }
}
