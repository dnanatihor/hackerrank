import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String x = sc.nextLine();
        String y = sc.nextLine();
        
        System.out.println(new BigInteger(x).add(new BigInteger(y)));
        System.out.println(new BigInteger(x).multiply(new BigInteger(y)));
    }
}