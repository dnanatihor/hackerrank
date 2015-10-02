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
        for (int i=0;i<n;i++) {
            a[i] = scanner.nextInt();
        }
        
        boolean isInvolution = true;
        
        for (int i=0;i<n;i++) {
            if (a[i] != a[a[a[i]-1]-1]) {
                isInvolution = false;
                break;
            }
        }
        
        
        if (isInvolution) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}