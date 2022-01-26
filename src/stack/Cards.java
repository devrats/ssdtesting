/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 25-Jan-22
 *   Time: 4:46 PM
 *   File: Cards.java
 */

package stack;

import java.util.*;
public class Cards {
    static ArrayList<Integer> primes = new ArrayList<Integer>();
    static Stack<Integer> a1 = new Stack<>();
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        ithPrime(5679875);
        int[] arr = new int[n];
        for(int i = 0 ;i<n ;i++){
            arr[i] = sc.nextInt();
            a1.push(arr[i]);
        }
        for(int i=0;i<q;i++){
            cards(a1,n,i);
        }
    }

    public static void cards(Stack<Integer> stack, int n, int j){
        Stack<Integer> a2 = new Stack<>();
        Stack<Integer> b1 = new Stack<>();
        int a = primes.get(j);
        while(!stack.empty()){
            int num = stack.pop();
            if(num%a==0){
                b1.push(num);
            } else{
                a2.push(num);
            }
        }
        a1 = (Stack<Integer>) a2.clone();
        while (!b1.empty()){
            System.out.println(b1.pop());
        }
        while (!a2.empty()){
            System.out.println(a2.pop());
        }
    }

    public static void ithPrime(int q){
        boolean [] IsPrime = new boolean[q];

        for(int i = 0; i < q; i++)
            IsPrime[i] = true;

        for (int p = 2; p * p < q; p++)
        {
            if (IsPrime[p] == true)
            {
                for (int i = p * p; i < q; i += p)
                    IsPrime[i] = false;
            }
        }
        for (int p = 2; p < q; p++)
            if (IsPrime[p] == true)
                primes.add(p);
    }
}
