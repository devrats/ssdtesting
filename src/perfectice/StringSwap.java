/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 07-Jan-22
 *   Time: 7:52 PM
 *   File: StringSwap.java
 */

package perfectice;

import java.util.*;

class StringSwap {
    public static int swap(int n, int p, int q, int k){
        String a = Integer.toBinaryString(n);
        a = String.format("%08",a);
        char[] arr = a.toCharArray();
        q=q-1;
        p=p-1;
        for(int i = 0;i<k;i++){
            char temp = arr[q+i];
            arr[q+i] = arr[p+i];
            arr[p+i] = temp;
        }
        String b = new String(arr);
        int c = Integer.parseInt(b,2);
        return c;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        n = swap (n, p, q, k);
        if(n == -1)
            System.out.print("Invalid");
        else
            System.out.print(n);
    }
}