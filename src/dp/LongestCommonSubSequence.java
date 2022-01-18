/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 17-Jan-22
 *   Time: 12:22 PM
 *   File: LongestCommonSubSequence.java
 */

package dp;

import java.util.Arrays;

public class LongestCommonSubSequence {

    public static void main(String[] args) {
        String s1 = "devvrat";
        String s2 = "vat";
        int[][] dp = new int[s1.length()][s2.length()];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(longestCommonSubsequence(s1, s2, 0, 0,dp));
    }

    public static int longestCommonSubsequence(String s1, String s2, int i, int j, int[][] dp) {
        int ans = 0;
        if (s1.length() == i || s2.length() == j) {
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if (s1.charAt(i) == s2.charAt(j)) {
            ans = 1 + longestCommonSubsequence(s1, s2, i + 1, j + 1,dp);
        } else {
            int a = longestCommonSubsequence(s1, s2, i + 1, j,dp);
            int b = longestCommonSubsequence(s1, s2, i, j + 1,dp);
            ans = Math.max(a, b);
        }
        return dp[i][j] = ans;
    }
}