import java.util.Scanner;
import java.util.Stack;
 
class Solution {
 
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
 
		while(scanner.hasNext()) {
			String str = scanner.nextLine();
 
			Stack<Character> stack = new Stack<Character>();
 
			boolean answer = true;
 
			for (int i=0;i<str.length();i++) {
 
				if (str.charAt(0) == '}' || str.charAt(0) == ']' || str.charAt(0) == ')') {
					answer = false;
					break;
				} else if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
					stack.push(str.charAt(i));
					//System.out.println(stack);
				} else if ( !stack.isEmpty() && (str.charAt(i) == '}' && stack.peek() == '{'  
						|| str.charAt(i) == ']' && stack.peek() == '['  
						|| str.charAt(i) == ')' && stack.peek() == '('  )) {
					stack.pop();
					//System.out.println(stack);
				} else {
					stack.push(str.charAt(i));
					//System.out.println(stack);
				}
			}
 
			if (!stack.isEmpty()) {
				answer = false;
			} 
			System.out.println(answer);
 
		}
	}
}