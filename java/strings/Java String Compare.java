import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        List<String> stringList = new ArrayList<String>();
        for (int i = 0; i < str.length()-(k-1) ; i++) {
            stringList.add(str.substring(i,i+k));
        }
        
        Collections.sort(stringList);
    
        System.out.println(stringList.get(0) +"\n"+stringList.get(stringList.size()-1));
        
    }
}