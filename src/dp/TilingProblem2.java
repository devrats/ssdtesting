/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 24-Jan-22
 *   Time: 11:19 AM
 *   File: TilingProblem2.java
 */

package dp;

import java.util.*;

public class TilingProblem2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arrayList.add(tile(a,b));
        }
        System.out.println(arrayList);
    }

    public static long tile(int n, int m) {
        if (n == 0) {
            return 1l;
        }
        if (n < 0) {
            return 0l;
        }
        long a = (tile(n - 1, m)) % (1000000000 + 7);
        long b = (tile(n - m, m)) % (1000000000 + 7);
        return a + b;
    }
}