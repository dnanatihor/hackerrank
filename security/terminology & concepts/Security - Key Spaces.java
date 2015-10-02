import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder(in.readLine());
        int move = Integer.parseInt(in.readLine());
        String number = "0123456789";
        for (int i = 0; i < str.length() ; i++) {
            if ((char)(str.charAt(i) + move) <= '9') {
                str.setCharAt(i, (char)(str.charAt(i) + move));
            } else {
            	//System.out.println("Value : " + number.charAt((number.indexOf(str.charAt(i))+ move)%9));
                str.setCharAt(i, number.charAt( (number.indexOf(str.charAt(i))+ move -1)%9));
            }
        }
        System.out.println(str);
    }
}