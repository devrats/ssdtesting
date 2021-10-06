/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 6/27/2021
 *   Time: 01:15 PM
 *   File: EndTermPractical.java
 *   Name: Devvrat Sharma
 *   Section: C
 *   Roll Number: 45(191500261)
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class EndTermPractical {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stackCopy(stack);
    }

    public static void stackCopy(Stack stack) {
        List list = new LinkedList();
        Stack copyStack = new Stack();
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            list.add(stack.pop());
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            stack.push(list.get(i));
            copyStack.push(list.get(i));
        }
        System.out.println(stack);
        System.out.println(copyStack);
    }
}