/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 26-Jan-22
 *   Time: 9:53 PM
 *   File: Histogram.java
 */

package stack;

import java.util.*;
public class Histogram {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i < n;i++)
            arr[i] = s.nextInt();

        Histogram mainobj = new Histogram();
        StacksUsingArrays stack = mainobj.new StacksUsingArrays(1000);
        System.out.println(hist(arr, stack));
    }


    public static long hist(int[] arr, StacksUsingArrays stack) throws Exception {

        //Write Your Code here
        Stack<Integer> s = new Stack<>();
        int arr1[] = new int[arr.length];
        arr1[0] = -1;
        s.push(0);
        for (int i = 1; i < arr.length; i++) {

            while (!s.isEmpty() && arr[i] < arr[s.peek()]) {
                s.pop();

            }
            if (s.isEmpty()) {
                arr1[i] = -1;
            } else {
                arr1[i] = s.peek();
            }
            s.push(i);
        }

        Stack<Integer> s1 = new Stack<>();
        int arr2[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            while (!s1.isEmpty() && arr[i] < arr[s1.peek()]) {
                arr2[s1.pop()] = i;

            }

            s1.push(i);
        }

        while(!s1.isEmpty()) {
            arr2[s1.pop()]=-1;
        }
        long area = 0;
        for(int i = 0;i<arr.length;i++){
            int left = 0;
            int right = 0;
            if(arr1[i]==-1){
                left = i;
            } else{
                left = i-arr1[i]-1;
            }
            if(arr2[i]==-1){
                right = arr.length-i;
            } else{
                right = arr2[i]-i;
            }
            long area1 = (left+right)*arr[i];
            area = Math.max(area,area1);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        return area;

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

