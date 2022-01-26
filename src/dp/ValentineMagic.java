/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 24-Jan-22
 *   Time: 5:45 PM
 *   File: ValentineMagic.java
 */

package dp;

import java.util.*;
public class ValentineMagic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        for(int i =0;i<m;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++){
            arr2[i] = sc.nextInt();
        }
        int[][] dp = new int[m][m];
        for(int i = 0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(valentine(arr1,arr2,0,0,dp));
    }

    public static int valentine(int arr1[], int arr2[], int i, int j,int[][] dp) {

        if (i == arr1.length) {
            return 0;
        }
        if (j == arr2.length) {
            return 10000000;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int a = Math.abs(arr1[i] - arr2[j]) + valentine(arr1, arr2, i + 1, j + 1,dp);
        int b = valentine(arr1, arr2, i, j + 1,dp);
        return dp[i][j] = Math.min(a,b);

    }
}