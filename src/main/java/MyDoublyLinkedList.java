
public class MyDoublyLinkedList<T> {
    public MyDoublyLinkedListNode<T> head = new MyDoublyLinkedListNode<T>(null, null, null);
    public MyDoublyLinkedListNode<T> tail = head;
    void addEnd(T d) {
        MyDoublyLinkedListNode<T> newTail = new MyDoublyLinkedListNode<T>(tail, null, d);
        tail.next = newTail;
        tail = newTail;
    }
    void printMe() {
        MyDoublyLinkedListNode<T> n = this.head;
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