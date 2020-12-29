
public class MySinglyLinkedList<T> {
    public MySinglyLinkedListNode<T> head = new MySinglyLinkedListNode<T>(null, null);
    public MySinglyLinkedListNode<T> tail = head;
    void addEnd(T d) {
        MySinglyLinkedListNode<T> newTail = new MySinglyLinkedListNode<T>(null, d);
        tail.next = newTail;
        tail = newTail;
    }
    void printMe() {
        MySinglyLinkedListNode<T> n = this.head;
        n = n.next;
        System.out.print("[");
        while (n != null) {
            System.out.print(n.data);
            if(n.next != null)
                System.out.print(", ");
            n = n.next;
        }
        System.out.print("]");
        System.out.println("");
    }
}
