public class Single<E> implements ListADT {

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
            temp.next =  new Node(data, null);
        }
        size++;
        return true;
    }

    @Override
    public E remove() {
        Node node = getNode(size - 1);
        E data = (E) node.getData();
        node.next = null;
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
            throw new ArrayIndexOutOfBoundsException("datt teri maa ki");
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

    class Node<E> {
        private E data;
        private Node next;

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
