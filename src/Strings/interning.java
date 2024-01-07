package Strings;

public class interning {
    public static void main(String[] args) {
        String s = "Hello";
//        s.charAt(0) = "O"   //Not Possible because of immutability
//        String x =  "Hello";
//        x = "Mello";
//        System.out.println(s);
        //2 -- 'y';
        s = s.substring(0,2) + "y" + s.substring(3);
        System.out.println(s);
    }
}
//Why Immutablity ---> Because of interning agr tum x  ka pehla character change kr rha ho too s
// bhi change ho jyga jiski vja sa hme dikkat hogi isliya immutabilty jasi cheez exist krti ha.

//Performance -- It is poor because of immuatability
