import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder(in.readLine());
        
        String numbers = "0123456789";
        
        for (int i = 0;i<str.length();i++) {
				
			if (str.charAt(i) == '9') {
				str.setCharAt(i, '0');
			} else {
				str.setCharAt(i, (char)(str.charAt(i) + 1));
			}			

        }
        
        System.out.println(str);
        
    }
}