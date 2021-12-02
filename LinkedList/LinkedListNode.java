package LinkedList;
public class LinkedListNode<T> {
  public T data;
  public LinkedListNode<T> next;

  public LinkedListNode(T data) {
    this.data = data;
  }

  public static void print(LinkedListNode<Integer> head) {
    while (head != null){
      System.out.print(head.data + " ");
      head = head.next;
    }
  }
}
