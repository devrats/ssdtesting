/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 17-Jan-22
 *   Time: 1:40 PM
 *   File: MinPath.java
 */

package dp;

import java.util.Arrays;

public class MinPath {

    public static void main(String[] args) {
        int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
        int[][] dp = new int[arr.length][arr[0].length];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(minPath(arr, 0, 0, dp));
    }

    public static int minPath(int[][] arr, int curri, int currj, int[][] dp){
        if(curri==arr.length-1 && currj==arr[0].length-1){
            return arr[curri][currj];
        }
        if(curri>= arr.length || currj>=arr[0].length){
            return Integer.MAX_VALUE;
        }
        if(dp[curri][currj]!=-1){
            return dp[curri][currj];
        }
        int a = minPath(arr, curri+1, currj, dp);
        int b = minPath(arr, curri, currj+1, dp);
        return dp[curri][currj] = Math.min(a,b)+arr[curri][currj];
    }
}