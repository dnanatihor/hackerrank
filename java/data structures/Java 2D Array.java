import java.util.*;
class Solution { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int ar[][]=new int[6][6]; 
        int ar1[]=new int[16]; 
        for(int i=0;i<6;i++) { 
            for(int j=0;j<6;j++) { 
                ar[i][j]=sc.nextInt(); 
            } 
        } 
        int k=0; int max=0; 
        for(int i=0;i<6;i++) { 
            for(int j=0;j<6;j++) { 
                if(i!=0 && j!=0 && i!=5 && j!=5) { 
                    ar1[k]=ar[i][j]+ar[i-1][j]+ar[i-1][j-1]+ar[i-1][j+1]+ar[i+1][j]+ar[i+1][j-1]+ar[i+1][j+1]; k++; 
                } 
            } 
        } 
        max=ar1[0]; 
        for(int i=0;i < k;i++) { 
            if (ar1[i]>max) {
            	max=ar1[i]; 
            }
        }
        System.out.println(max); 
    } 
}