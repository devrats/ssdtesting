/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 06-Feb-22
 *   Time: 1:12 PM
 *   File: QuestionOne.java
 */

package Infosys;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class QuestionOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        LinkedList<String> list = new LinkedList<>();
        LinkedList<String> ans = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String a = scanner.nextLine();
            list.add(a);
        }
        for (int i = 0; i < list.size(); i++) {
            String string = "";
            HashSet set = new HashSet();
            String[] str = list.get(i).split(" ");
            //System.out.println(Arrays.toString(str));
            for (int j = 0; j < str.length; j++) {
                if(!set.contains(str[j])){
                    string = string +" " + str[j];
                    set.add(str[j]);
                }
            }
            //System.out.println(list.get(i));
            //System.out.println(string.trim());
            if(list.get(i).equals(string.trim())){
                ans.add("X");
            } else {
                ans.add(string.trim());
            }
        }
        System.out.println(ans);
    }
}