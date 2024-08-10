/**
 * implement
 */
public class implement {
  // create a class for Node

  public static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  // print using while loop until head.next is not equal to null
  public static void printLL(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;

    }
  }
  // print using recurssion until head.next is not equal to null

  public static void printLLR(Node head) {
    if (head == null) {
      return;
    }
    System.out.print(head.data + " ");
    printLLR(head.next);
  }

  // print reverse linkedlist using recurrsion until head.next is not equal to
  // null
  public static void printLLReverse(Node head) {
    if (head == null) {
      return;
    }
    printLLReverse(head.next);
    System.out.print(head.data + " ");

  }

  public static void length(Node a) {
    int count = 0;
    while (a != null) {

      count++;
      a = a.next;

      System.out.println(count);
    }
  }

  public static void main(String[] args) {
    Node a = new Node(1);
    Node b = new Node(2);
    Node c = new Node(4);
    Node d = new Node(6);
    a.next = b;
    b.next = c;
    c.next = d;
    Node head = a;
    printLL(head);
    System.out.println();
    printLLR(head);
    System.out.println();
    printLLReverse(head);
    length(head);

  }
}