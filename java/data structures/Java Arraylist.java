import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int limit = in.nextInt();
        List<List<Integer>> arrayofArrayList = new ArrayList<List<Integer>>();
        
        for (int i=0;i<limit;i++) {
            
            int k = in.nextInt();
            
            List<Integer> arrayList = new ArrayList<Integer>();
            arrayList.add(k);
            for(int j=0;j<k;j++) {
                arrayList.add(in.nextInt());
            }
            
            arrayofArrayList.add(arrayList);
        }
        
        //System.out.println(arrayofArrayList);
        
        limit = in.nextInt();
        int a[][] = new int[limit][2];
        for(int i = 0;i<limit;i++) {
            
			a[i][0] = in.nextInt();
			a[i][1] = in.nextInt();
            
		}
		
		for	(int i=0;i<limit;i++) {
				
			int r = a[i][0];
			int s = a[i][1];
			
			if (r!=0 && s!= 0 && arrayofArrayList.get(r-1).get(0)!=0 && arrayofArrayList.get(r-1).size() > s) {
                System.out.println(arrayofArrayList.get(r-1).get(s));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}