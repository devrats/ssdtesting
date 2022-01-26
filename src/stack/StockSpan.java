/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 26-Jan-22
 *   Time: 10:41 AM
 *   File: StockSpan.java
 */

package stack;

import java.util.*;
public class StockSpan {
    public static void main(String args[]) throws Exception {
        // Your Code Here
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        StockSpan mainobj = new StockSpan();
        int[] prices=new int[N];
        for(int i=0;i<N;i++){
            prices[i]=s.nextInt();
        }
        StacksUsingArrays stack = mainobj.new StacksUsingArrays(prices.length);
        int[] ans=StockSpanUsingStacks(prices, stack);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println("END");

    }

    public static int[] StockSpanUsingStacks(int[] arr, StacksUsingArrays stack) throws Exception {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {

            while (!st.empty() && arr[i] > arr[st.peek()]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = i + 1;
            } else {
                ans[i] = i - st.peek();
            }

            st.push(i);

        }
        return ans;
    }

    private class StacksUsingArrays {
        private int[] data;
        private int tos;

        public static final int DEFAULT_CAPACITY = 10;

        public StacksUsingArrays() throws Exception {
            // TODO Auto-generated constructor stub
            this(DEFAULT_CAPACITY);
        }

        public StacksUsingArrays(int capacity) throws Exception {
            if (capacity <= 0) {
                System.out.println("Invalid Capacity");
            }
            this.data = new int[capacity];
            this.tos = -1;
        }

        public int size() {
            return this.tos + 1;
        }

        public boolean isEmpty() {
            if (this.size() == 0) {
                return true;
            } else {
                return false;
            }
        }

        public void push(int item) throws Exception {
            if (this.size() == this.data.length) {
                throw new Exception("Stack is Full");
            }
            this.tos++;
            this.data[this.tos] = item;
        }

        public int pop() throws Exception {
            if (this.size() == 0) {
                throw new Exception("Stack is Empty");
            }
            int retVal = this.data[this.tos];
            this.data[this.tos] = 0;
            this.tos--;
            return retVal;
        }

        public int top() throws Exception {
            if (this.size() == 0) {
                throw new Exception("Stack is Empty");
            }
            int retVal = this.data[this.tos];
            return retVal;
        }

        public void display() throws Exception {
            if (this.size() == 0) {
                throw new Exception("Stack is Empty");
            }
            for (int i = this.tos; i >= 0; i--) {
                System.out.println(this.data[i]);
            }

        }

    }

}

