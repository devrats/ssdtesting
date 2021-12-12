/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 19-Oct-21
 *   Time: 7:42 PM
 *   File: LeetCode2.java
 */


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public static void main(String[] args) {
        int [] arr = {1,9,9,9,9,9,9,9,9,9};
        int [] arr1 = {9};
        ListNode l3 = null;
        ListNode temp = null;
        ListNode l31 = null;
        ListNode temp1 = null;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                l3 = new ListNode(arr[i]);
                temp = l3;
            } else {
                ListNode l4 = new ListNode(arr[i]);
                temp.next = l4;
                temp = temp.next;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (i == 0) {
                l31 = new ListNode(arr1[i]);
                temp1 = l31;
            } else {
                ListNode l4 = new ListNode(arr1[i]);
                temp1.next = l4;
                temp1 = temp1.next;
            }
        }

        ListNode l1 = addTwoNumbers(l3,l31);
        for (int i= 0;l1!=null;i++){
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = null;
        ListNode temp = null;
        double a = 0;
        for (double i = 1; l1 != null; i = i * 10) {
            a = a + l1.val * i;
            l1 = l1.next;
        }
        double b = 0;
        for (double i = 1; l2 != null; i = i * 10) {
            b = b + l2.val * i;
            l2 = l2.next;
        }
        double c = a + b;
        while (c != 0) {
            int d = (int) c % 10;
            c = (int) c / 10;
            if (l3 == null) {
                String e = "ghcfhycfhc";
                l3 = new ListNode(d);
                temp = l3;
            } else {
                ListNode l4 = new ListNode(d);
                temp.next = l4;
                temp = temp.next;
            }
        }
        return l3;
    }
}