/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 28-Jan-22
 *   Time: 10:21 AM
 *   File: NumberSequence.java
 */

package Infosys;

import java.util.Scanner;

public class NumberSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        number(arr,a);
    }

    public static void number(int[] arr, int n){
        String str = "";
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==5){
                while(arr[i]!=8){
                    str = str + arr[i];
                    i++;
                }
                str = str + arr[i];
            } else{
                count = count + arr[i];
            }
        }
        System.out.println(str);
        System.out.println(count);
        System.out.println(count + Integer.parseInt(str));
    }
}