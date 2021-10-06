/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 4/19/2021
 *   Time: 9:43 AM
 *   File: LCM.java
 */

public class GCD {
    // Function to return gcd of a and b
    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static int findGCD(int arr[]) {
        int result = 0;
        for (int element : arr) {
            result = gcd(result, element);
            if (result == 1) {
                return 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {2, 0, 6, 8, 16};
        int n = arr.length;
        System.out.println(findGCD(arr));
    }
}