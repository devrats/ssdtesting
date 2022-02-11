/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 11-Feb-22
 *   Time: 9:14 AM
 *   File: ChocolateThief.java
 */

package randomquestion;

import java.util.Scanner;

public class ChocolateThief {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(n, h, arr);
    }

    public static void solution(int n, int h, int[] arr) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int speed;
        if (sum % h == 0) {
            speed = sum / h;
        } else {
            speed = sum / h + 1;
        }
        label:
        for (; speed<=max; speed++) {
            int j = 0;
            int count = 0;
            while (true) {
                if (arr[j] <= speed) {
                    arr[j] = 0;
                    j++;
                    count++;
                } else if (arr[j] > speed) {
                    arr[j] = arr[j] - speed;
                    count++;
                }
                if (count > h) {
                    break;
                }
                if (j == arr.length) {
                    break label;
                }
            }
        }
        System.out.println(speed);
    }
}

//4
//8
//3 5 11 7
//4