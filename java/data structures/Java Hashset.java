import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int limit = in.nextInt();
        in.nextLine();
        
        Set<String> hashSet = new HashSet<String>();
        for(int i=0;i<limit;i++) {
            
            //String key = in.next(); String value = in.next();
            hashSet.add(in.nextLine());
            System.out.println(hashSet.size());
            
        }
    }
}