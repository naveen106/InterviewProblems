/*
Ninja has been given a Singly Linked List having N nodes.
As part of a test, he has been asked to find the Nth node from the end of the linked list.
Since Ninja is not so good at studies, he asked you to help him with the same.

Your task is to find the Nth node from last.
For Example
If the given list is (4 -> 3 -> 2 -> 7) and N = 2:
Then the 2nd node from the end is 2.
*/
package LinkedList;
import java.util.Scanner;
public class LastNthNode {
    static LinkedListNode<Integer>findLastNth(LinkedListNode<Integer> head, int n){
      LinkedListNode<Integer> pointer1 = head, pointer2 = head;
      while(n!=0){
        pointer2 = pointer2.next;
        n--;
      }
      while(pointer2.next != null){
        pointer1 = pointer1.next;
        pointer2 = pointer2.next;
      }
      return pointer1;
    }
  public static void main(String[] args) {
    LinkedListNode<Integer> head = new MakeLinkedList().MakeLinkedList();

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the last n-th node position: ");

    head = findLastNth(head, input.nextInt());
    input.close();

    while(head != null){
      System.out.print(head.data + " ");
      head = head.next;
    }
  }
}
