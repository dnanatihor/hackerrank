import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T>0) {
            int Px = in.nextInt(), Py = in.nextInt(), Qx = in.nextInt(), Qy = in.nextInt();
            System.out.println((2*Qx-Px) + " " + (2*Qy-Py));
            T--;
        }
    }
}