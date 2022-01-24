/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 24-Jan-22
 *   Time: 11:10 AM
 *   File: TilingProblem.java
 */

package dp;

import java.util.*;
public class TilingProblem {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] dp = new long[n+1];
        Arrays.fill(dp,-1);
        System.out.println(tile(n,dp));
    }

    public static long tile(int n,long[] dp){
        if(n<0){
            return 0l;
        }
        if(n==0){
            return 1l;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        long a = tile(n-1,dp);
        long b = tile(n-2,dp);
        return dp[n] = a+b;
    }
}