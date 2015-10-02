import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * [@author](/author) idobles
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int n, m;
        int array[];
        Set<Integer> set;
        for (int iterator = 0; iterator < testCases; iterator++) {
            n = sc.nextInt();
            m = sc.nextInt();
            set = new HashSet<>();
            array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            set.add(0);
            if(attemptSolve(array, set, m, 0)){
                System.out.println("YES");
            }else{
               System.out.println("NO"); 
            }
        }
    }

    private static boolean attemptSolve(int[] array, Set<Integer> set, int m, int pos) {
        boolean solved = false;
        if (pos + m > array.length - 1 || pos == array.length - 1) {
            //SOLVED
            solved = true;
        } else if (array[pos + 1] == 0 && !set.contains(pos + 1)) {
            //Check pos + 1
            set.add(pos + 1);
            if (attemptSolve(array, set, m, pos + 1)) {
                solved = true;
            }
        }
        if (!solved && pos != 0 && array[pos - 1] == 0 && !set.contains(pos - 1)) { //It cheks pos != 0 because otherwise, array[-1] would be checked, causing an out of bounds error
            //Check pos - 1
            set.add(pos + 1);
            if (attemptSolve(array, set, m, pos - 1)) {
                solved = true;
            }
        }
        if (!solved && array[pos + m] == 0 && !set.contains(pos + m)) {
            //Check pos + m
            set.add(pos + m);
            if (attemptSolve(array, set, m, pos + m)) {
                solved = true;
            }
        }
        return solved;
    }

}