/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 25-Jan-22
 *   Time: 6:55 PM
 *   File: RedundentParethesis.java
 */

package stack;

import java.util.Scanner;
import java.util.Stack;

public class RedundentParethesis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            reun(s);
        }
    }

    public static void reun(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch==')'){
                if(stack.pop()=='('){
                    System.out.println("Duplicate");
                    return;
                } else {
                    while (!(stack.pop() =='(')){
                        continue;
                    }
                }
            } else{
                stack.push(ch);
            }
        }
        System.out.println("Not Duplicate");;
    }
}