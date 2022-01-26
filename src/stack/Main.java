/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 25-Jan-22
 *   Time: 4:12 PM
 *   File: Main.java
 */

package stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < a; i++) {
            String s = sc.nextLine();
            expression(s);
        }
    }

    public static void expression(String str){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='*' || str.charAt(i)=='+' || str.charAt(i)=='-' || str.charAt(i)=='/'){
                int a = stack.pop();
                int b = stack.pop();
                switch (str.charAt(i)){
                    case '*': stack.push(b*a);
                    break;
                    case '+': stack.push(b+a);
                    break;
                    case '-':stack.push(b-a);
                    break;
                    case '/': stack.push(b/a);
                    break;
                }
            } else {
                stack.push(Integer.parseInt(Character.toString(str.charAt(i))));
            }
        }
        System.out.println(stack.pop());
    }
}