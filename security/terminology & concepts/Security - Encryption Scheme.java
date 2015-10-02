import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        
        System.out.println(fact(n));
    }
    
    public static int fact(int n) {
        
        if (n<1) {
            return 1;
        } else {
            return n*fact(n-1);
        }            
    }
    
}