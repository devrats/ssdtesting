/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 19-Jan-22
 *   Time: 11:17 AM
 *   File: ClimbingStairs.java
 */

package dp;

import java.util.*;
class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i = 0; i<a;i++){
            arr[i] = sc.nextInt();
        }
        int b = climbingStairs(a,arr,-1);
        System.out.println(b);
    }

    public static int climbingStairs(int n, int[] arr, int curr){
        int ans =0;
        if(curr>n){
            return Integer.MAX_VALUE;
        }
        if(curr==n){
            return ans;
        }
        int a = climbingStairs(n, arr,curr+1);
        int b = climbingStairs(n, arr,curr+2);
        if(curr==-1){
            return Math.min(a,b);
        } else{
            return Math.min(a,b) + arr[curr];
        }
    }
}