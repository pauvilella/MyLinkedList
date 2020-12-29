
public class MySinglyLinkedListNode<T> {
    MySinglyLinkedListNode<T> next = null;
    T data = null;
    public MySinglyLinkedListNode(MySinglyLinkedListNode<T> n, T d) {
        next = n;
        data = d;
    }
    void printMe() {
        T d = this.data;
        T n = (next != null) ? next.data : null;
        System.out.println("Node: (data = " + d + ", next = " + n + ")");
    }
}