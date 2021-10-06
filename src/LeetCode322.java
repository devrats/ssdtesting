/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 29-Sep-21
 *   Time: 11:38 AM
 *   File: LeetCode322.java
 */

import java.util.Arrays;

public class LeetCode322 {
    public static int coinChange(int[] coins, int amount) {
        int coin = 0;
        Arrays.sort(coins);
        for(int i = coins.length-1; i>=0;i--){
            int a = amount/coins[i];
            int val = a*coins[i];
            amount = amount-val;
            coin = coin+a;
            if(0==amount){
                return coin;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {186,419,83,408};
        System.out.println(arr);
        int amt = 6249;
        System.out.println(amt);
        coinChange(arr,amt);
    }
}