/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 26-Jan-22
 *   Time: 11:50 AM
 *   File: Number.java
 */

package stack;

import java.util.*;
public class Number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            number(s);
        }
    }

    public static void number(String s){
        int [] arr = new int[s.length()+1];
        int count = 1;
        for(int i = 0; i<=s.length();i++){
            if(i==s.length()|| s.charAt(i)=='I'){
                arr[i] = count;
                count++;
                int j = i-1;
                while(j>=0 && s.charAt(j)=='D'){
                    arr[i] = count;
                    count++;
                    j--;
                }
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}