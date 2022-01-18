package linkedlist;

import org.w3c.dom.Node;

public class Single<E> implements ListADT, Comparable {

    public Node getHead() {
        return head;
    }

    private Node head = null;
    private int size;

    @Override
    public boolean add(Object data) {
        if (head == null) {
            head = new Node(data, null);
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.next = new Node(data, null);
        }
        size++;
        return true;
    }

    public void shift(int k){
        Node temp = head;
        Node temp1  = null;
        while (temp!=null){
            temp1  = temp;
            temp = temp.next;
        }

        for(int i = 0; i<k;i++){
            Node n = head;
            head = head.next;
            temp1.next = n;
            temp1 = temp1.next;
        }
    }

    public void removeFirst() {
        if (head == null) {
            return;
        } else {
            Node temp = this.head;
            this.head = temp.next;
            size--;
        }
    }

    @Override
    public E remove() {
        Node node = getNode(size - 2);
        E data = (E) node.next.getData();
        node.next = null;
        size--;
        return data;
    }

    private Node getNode(int i) {
        Node head1 = head;
        for (int index = 0; index < i; index++) {
            head1 = head1.getNext();
        }
        return head1;
    }

    @Override
    public int search(Object data) {
        int counter = 0;
        Node head1 = head;
        for (int index = 0; index < size; index++) {
            if (head1.getData() == data) {
                counter++;
                return 1;
            }
            head1 = head1.getNext();
        }
        if (counter == 0) {
            return -1;
        }
        return 0;
    }

    @Override
    public void add(int index, Object data) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException("Can't insert the element");
        } else if (index == 0) {
            this.head = new Node((E) data,this.head);
            size++;
        } else {
            Node node = getNode(index - 1);
            Node temp = node.getNext();
            node.next = new Node((E) data, temp);
            size++;
        }
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            // fetch the data for the current node
            E data = (E) this.getNode(i).getData();
            System.out.print(data + (i < size - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    @Override
    public int compareTo(Object o) {
        Integer.compare(5, 7);
        return 0;
    }

    public int length() {
        Node temp = this.head;
        int count = 0;
        if (temp == null) {
            return count;
        }
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void getNumber(Single<Integer> list) {
        Node temp = (Node) list.getHead();
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }

    }

    public boolean addFirst(Object element) {
        Node temp = this.head;
        if (temp == null) {
            head = new Node(element, null);
            this.size++;
            return true;
        } else {
            head = new Node(element, temp);
            this.size++;
            return true;
        }

    }

    public void remove(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException("Can't delete the element");
        } else if (index == 0) {
            this.head = this.head.next;
            size--;
        } else {
            Node node = getNode(index - 1);
            Node temp = node.getNext();
            node.next = temp.next;
            size--;
        }
    }

    public Node middle(){
        Node node = this.head;
        Node node1 = this.head;
        while (node.next!=null && node!=null){
            node = node.next.next;
            node1 = node1.next;
        }
        return node1;
    }

    class Node<E> {
        private E data;
        private Node next;

        @Override
        public String toString() {
            return String.valueOf(data);
        }

        public E getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(E data) {
            this.data = data;
        }

        public Node() {

        }
    }
}
