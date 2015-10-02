 import java.io.*;
    import java.util.*;



     class Solution {

      
        public static void main(String[] args) 
        {

      
          Scanner scan = new Scanner(System.in);
          String s=scan.nextLine();
          StringTokenizer stringTokenizer = new StringTokenizer(s, "!,?._' @");
            
          System.out.println(stringTokenizer.countTokens());
          while(stringTokenizer.hasMoreElements()) {
              System.out.println(stringTokenizer.nextToken());
          }

        }
    }