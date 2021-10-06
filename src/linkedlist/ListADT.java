package linkedlist;

public interface ListADT<E> {
    boolean add(E data);
    E remove();
    int search(E data);
    void add(int index, E data);

}
