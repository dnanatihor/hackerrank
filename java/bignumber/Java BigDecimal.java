import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        sc.nextLine();
        BigDecimal[] bigD = new BigDecimal[limit];
        
        for (int i = 0; i<limit;i++) {
            
            bigD[i] = new BigDecimal(sc.next());
        }
        
        Arrays.sort(bigD);
        
        for(int i = limit-1 ;i>=0;i--) {
            
            if ((bigD[i].compareTo(new BigDecimal("-1")) > 0 && bigD[i].compareTo(new BigDecimal("0"))< 0) || (bigD[i].compareTo(new BigDecimal("1")) < 0 && bigD[i].compareTo(new BigDecimal("0")) > 0)) {
                System.out.println(bigD[i].toPlainString().replaceFirst("^0\\.", "."));
            } else {
                System.out.println(bigD[i]);
            }
        }
        
        
        
    }
}