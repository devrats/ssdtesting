package linkedlist;

import linkedlist.Single;

public class Main {
    public static void main(String[] args) {
        Single<Integer> list = new Single<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.print();
//        list.addFirst(0);
//        list.print();
//        list.removeFirst();
//        list.print();
//        list.remove();
//        list.print();
//        list.add(0,23);
//        list.removeFirst();
//        list.removeFirst();
//        list.removeFirst();
//        list.removeFirst();
//        System.out.println(list.length());
//        list.remove(1);
//        list.print();
        System.out.println(list.middle());
    }
}
