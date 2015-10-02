import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int a[] = new int[n];
        int ia[] = new int[n];
        for(int i =0;i<n;i++) {
            a[i] = scanner.nextInt();
            ia[a[i]-1] = i+1; 
        }
        
        for(int i=0;i<n;i++) {
            System.out.println(ia[i]);
        }
    }
}