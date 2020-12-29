
public class MyDoublyLinkedListNode<T> {
    MyDoublyLinkedListNode<T> next = null;
    MyDoublyLinkedListNode<T> previous = null;
    T data = null;

    public MyDoublyLinkedListNode(MyDoublyLinkedListNode<T> p, MyDoublyLinkedListNode<T> n, T d) {
        previous = p;
        next = n;
        data = d;
    }
    void printMe() {
        T d = this.data;
        T p = (previous != null) ? previous.data : null;
        T n = (next != null) ? next.data : null;
        System.out.println("Node: (data = " + d + ", previous = " + p + ", next = " + n + ")");
    }
}