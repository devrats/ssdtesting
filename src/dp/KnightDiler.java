/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 20-Jan-22
 *   Time: 1:44 PM
 *   File: KnightDiler.java
 */

package dp;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println(knightDialer(7));
    }
    public static int knightDialer(int n) {
        String[][] str = {{"1","2","3"},{"4","5","6"},{"7","8","9",},{"*","0","#"}};
        int count = 0;
        int[][] dp = new int[4][3];
        for(int i = 0; i<4;i++){
            Arrays.fill(dp[i], -1);
        }
        for(int i = 0; i<4;i++){
            for(int j=0;j<3;j++){
                count+=knight(n,i,j,str,"",dp);
            }
        }
        return count;
    }

    public static int knight(int n, int i, int j, String[][] str, String res, int[][] dp){

        if(res.length()==n){
            if(list.contains(res)){
                return 0;
            }
            list.add(res);
            //System.out.println(res);
            return 1;
        }
        if(i<0 || j<0 || i>=str.length ||j>=str[0].length){
            return 0;
        }
        if(i==3 && j==0){
            return 0;
        }
        if(i==3 && j==2){
            return 0;
        }
        int count = 0;
        int a = knight(n,i-2,j-1,str,res+str[i][j],dp);
        int b = knight(n,i-1,j-2,str,res+str[i][j],dp);
        int c = knight(n,i+1,j-2,str,res+str[i][j],dp);
        int d = knight(n,i+2,j-1,str,res+str[i][j],dp);
        int e = knight(n,i-2,j+1,str,res+str[i][j],dp);
        int f = knight(n,i-1,j+2,str,res+str[i][j],dp);
        int g = knight(n,i+1,j+2,str,res+str[i][j],dp);
        int h = knight(n,i+2,j+1,str,res+str[i][j],dp);
        dp[i][j] =  a+b+c+d+e+f+g+h;
        count =  a+b+c+d+e+f+g+h;
        return count;
    }
}