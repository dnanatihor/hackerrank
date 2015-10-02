import java.io.*;
import java.util.*;
 
class Solution {
 
    public static void main(String[] args) {
 
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean isPalin = true;
        for (int i=0;i<A.length()/2 ; i++) {
            if (A.charAt(i) != A.charAt(A.length() -i -1)) {
                isPalin = false;
            }
        }
 
        if (isPalin) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
 
    }
}