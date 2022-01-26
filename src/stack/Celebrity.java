/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 26-Jan-22
 *   Time: 1:52 PM
 *   File: Celebrity.java
 */

package stack;

import java.util.*;

public class Celebrity {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] arr = { {0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 1, 0} }; //new int[a][a];
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < a; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
        celebrity(arr,a);
    }

    public static void celebrity(int[][] arr, int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (arr[i][j] == 1) {
                    break;
                }
                if (j == a - 1) {
                    if(i==0){
                        for(int k = 1;k<a;k++){
                            for(int l = 0; l<a;l++){
                                if(arr[k][l]==1){
                                    System.out.println(i);
                                    return;
                                }
                            }
                            if(k==a-1){
                                System.out.println("No Celebrity");
                                return;
                            }
                        }
                    }
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println("No Celebrity");
    }
}