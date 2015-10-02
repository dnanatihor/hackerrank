import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean isBijective = true;
        
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i=0;i<n;i++) {
            int m = scanner.nextInt();
            if (arrayList.contains(m)) {
                isBijective = false;
            } else {
                arrayList.add(m);
            }
            
        }
        
        if (isBijective) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}