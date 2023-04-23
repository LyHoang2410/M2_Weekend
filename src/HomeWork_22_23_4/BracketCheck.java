package HomeWork_22_23_4;

import java.util.Scanner;
import java.util.Stack;

public class BracketCheck {
    public static boolean check(String bracket) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < bracket.length(); i++) {
            char b = bracket.charAt(i);
            if (b == '(') {
                stack.push(b);
            } else if (b == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string of brackets you want to check: ");
        String bracket = scanner.nextLine();
        if(check(bracket)){
            System.out.println("Valid expression");
        }
        else {
            System.out.println("Invalid expression");
        }
    }
}
