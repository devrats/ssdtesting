/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 20-Jan-22
 *   Time: 9:42 PM
 *   File: Tile.java
 */

package dp;

import java.util.*;
class Main1 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            //int[] dp = new int[n+1];
            //Arrays.fill(dp,-1);
            System.out.println(tile(a,b));
        }
    }

    public static int tile(int n,int m){
        if(m>n){
            return 1;
        }
        if(m==n){
            return 2;
        }
        int a = tile(n-1,m);
        int b = tile(n-m,m);
        return  a+b;
    }
}