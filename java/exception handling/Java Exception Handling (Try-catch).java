import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=0,y=0;
        try {
            x = sc.nextInt();
            y = sc.nextInt();
        } catch (Exception e) {
            System.out.println("java.util.InputMismatchException");
            System.exit(0);
        }

        if (y==0) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        } else {
             System.out.println(x/y);
        }
        
        
    }
}