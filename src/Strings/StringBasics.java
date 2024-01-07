package Strings;

import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
//         String str = "Aditya";
//         String s = sc.next();  //For the first word of sentence
//         String s = sc.nextLine();   //For full sentence.
//         System.out.println(s);

//        String str = "Hello";
//        String gtr = "Jello";
//        int len = str.length();
//        System.out.println(len);
//        System.out.println(str.charAt(2));
//        System.out.println(str.indexOf("t"));
//        System.out.println(str.compareTo(gtr));

        String str = "Aditya";
//        System.out.println(str.contains("dit"));
//        System.out.println(str.startsWith("A"));
//        System.out.println(str.endsWith("a"));

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.concat("Sethi"));
    }
}
