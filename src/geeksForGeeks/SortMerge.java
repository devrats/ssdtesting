/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 17-Jan-22
 *   Time: 7:57 PM
 *   File: SortMerge.java
 */

package geeksForGeeks;

// { Driver Code Starts
import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}


class MergeLists
{
    Node head;



    /* Function to print linked list */
    public static void printList(Node head)
    {

        while (head!= null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }



    /* Driver program to test above functions */
    public static void main(String args[])
    {


        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        while(t>0)
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            Node head1 = new Node(sc.nextInt());
            Node tail1 = head1;
            for(int i=0; i<n1-1; i++)
            {
                tail1.next = new Node(sc.nextInt());
                tail1 = tail1.next;
            }
            Node head2 = new Node(sc.nextInt());
            Node tail2 = head2;
            for(int i=0; i<n2-1; i++)
            {
                tail2.next = new Node(sc.nextInt());
                tail2 = tail2.next;
            }

            LinkedList obj = new LinkedList();
            Node head = obj.sortedMerge(head1,head2);
            printList(head);

            t--;

        }
    }
}
// } Driver Code Ends


/*
  Merge two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
        // This is a "method-only" submission.
        // You only need to complete this method
        Node temp1 = head1;
        Node temp2 = head2;
        Node head = null;
        Node temp = head;
        while(temp1!=null && temp2!=null){
            if(temp1.data==temp2.data){
                Node node = new Node(temp1.data);
                Node node1 = new Node(temp1.data);
                if(head==null){
                    head = node;
                    temp = head;
                } else{
                    temp.next = node;
                    temp.next.next = node1;
                    temp = temp.next.next;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            else if(temp1.data>temp2.data){
                Node node = new Node(temp1.data);
                if(head==null){
                    head = node;
                    temp=head;
                } else{
                    temp.next = node;
                    temp = temp.next;
                }
                temp1 = temp1.next;
            }
            else if(temp1.data<temp2.data){
                Node node = new Node(temp2.data);
                if(head==null){
                    head = node;
                    temp=head;
                } else{
                    temp.next = node;
                    temp = temp.next;
                }
                temp2 = temp2.next;
            }
        }
        if(temp1==null){
            while(temp2!=null){
                Node node = new Node(temp2.data);
                if(head==null){
                    head = node;
                    temp=head;
                } else{
                    temp.next = node;
                    temp = temp.next;
                }
                temp2 = temp2.next;
            }
        }
        if(temp2==null){
            while(temp1!=null){
                Node node = new Node(temp1.data);
                if(head==null){
                    head = node;
                    temp=head;
                } else{
                    temp.next = node;
                    temp = temp.next;
                }
                temp1 = temp1.next;
            }
        }
        return head;
    }
}
