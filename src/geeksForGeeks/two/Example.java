/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 24-Jan-22
 *   Time: 9:51 PM
 *   File: Example.java
 */

package geeksForGeeks.two;

// { Driver Code Starts
import java.util.*;



class Get_Min_From_Stack
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int q = sc.nextInt();
            GfG g = new GfG();
            while(q>0)
            {
                int qt = sc.nextInt();

                if(qt == 1)
                {
                    int att = sc.nextInt();
                    g.push(att);
                    //System.out.println(att);
                }
                else if(qt == 2)
                {
                    System.out.print(g.pop()+" ");
                }
                else if(qt == 3)
                {
                    System.out.print(g.getMin()+" ");
                }

                q--;
            }
            System.out.println();
            T--;
        }

    }
}


// } Driver Code Ends


class GfG
{
    int minEle;
    Stack<Integer> s = new Stack<>();
    static int min = Integer.MAX_VALUE;
    /*returns min element from stack*/
    int getMin()
    {
        // Your code here
        if(s.empty()){
            return -1;
        }
        return min;
    }

    /*returns poped element from stack*/
    int pop()
    {
        // Your code here
        if(s.empty()){
            return -1;
        }
        int size = s.size();
        int a = s.pop();
        if(s.empty()){
            min = Integer.MAX_VALUE;
        }
        Stack<Integer> s1 = new Stack<>();
        if(a==min){
            for(int i = 0;i<size-1;i++){
                int b = s.pop();
                if(min>b){
                    min = b;
                }
                s1.push(b);
            }
            for(int i = 0;i<size-1;i++){
                s.push(s1.pop());
            }
        }
        return a;
    }

    /*push element x into the stack*/
    void push(int x)
    {
        // Your code here
        if(min>x){
            min = x;
        }
        s.push(x);
    }
}

