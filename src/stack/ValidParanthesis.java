/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 25-Jan-22
 *   Time: 6:09 PM
 *   File: ValidParanthesis.java
 */

package stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
    }

    public static boolean isBalanced(String str) throws Exception {
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<str.length();i++){
            char top = str.charAt(i);
            if(str.charAt(i)=='[' || str.charAt(i)=='(' || str.charAt(i)=='{'){
                stack.push(top);
            } else{
                if(stack.isEmpty()){
                    return false;
                } else{
                    char curr = stack.pop();
                    if(top=='[' && curr ==']'){
                        continue;
                    } else if(top=='{' && curr =='}'){
                        continue;
                    } else if(top=='(' && curr ==')'){
                        continue;
                    } else{
                        return false;
                    }
                }
            }
        }
        return stack.empty();
    }
}