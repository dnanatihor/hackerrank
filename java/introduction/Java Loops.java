import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 
class Solution {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
 
        for (; T> 0; T--) {
 
            int A = in.nextInt();int B = in.nextInt(); int n = in.nextInt();
            int sum = A;
            for (int i =0 ;i<n;i++) {
                sum += (int)Math.pow(2,i)*B;
                System.out.print(sum+ " ");
            }
            System.out.println();            
        }
    }
}