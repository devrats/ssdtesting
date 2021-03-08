public class Main {
    public static void main(String[] args) {
        Single<Student> list = new Single<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.print();
        list.add(2,4);
        list.print();
        list.remove();
        list.print();
        System.out.println(list.search(7));

    }
}
