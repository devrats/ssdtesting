/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 17-Jan-22
 *   Time: 9:14 PM
 *   File: RemoveOcurrence.java
 */

package geeksForGeeks.one;

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
class duplicates
{
    Node head;
    Node tail;
    public void addToTheLast(Node node)
    {
        if (head == null)
        {
            head = node;
            tail = node;
        }
        else
        {
            tail.next = node;
            tail = node;
        }
    }
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    /* Drier program to test above functions */
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            duplicates llist = new duplicates();
            int a1=sc.nextInt();
            Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < N; i++)
            {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            Solution ob = new Solution();
            head = ob.removeAllDuplicates(llist.head);
            llist.printList(head);

            t--;
        }
    }

}// } Driver Code Ends


//User function Template for Java

/* Linked List Node class

class Node
{
    int data;
    Node next;
}

*/

class Solution
{
    public static Node removeAllDuplicates(Node head)
    {
        //code here
        Node head1 = null;
        Node temp1 = null;
        HashMap<Integer,Integer> set = new HashMap<>();
        Node temp = head;
        while(temp!=null){
            if(set.containsKey(temp.data)){
                set.put(temp.data,set.get(temp.data)+1);
            }else{
                set.put(temp.data,1);
            }
            temp = temp.next;
        }
        for(HashMap.Entry<Integer, Integer> entry: set.entrySet()){
            if(entry.getValue()==1){
                Node node = new Node(entry.getKey());
                if(head1==null){

                    head1 = node;
                    temp1 = head1;
                }else{
                    temp1.next = node;
                    temp1 = temp1.next;
                }
            }
        }
        return head1;
    }
}