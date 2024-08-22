import org.w3c.dom.Node;

public class nthNodeFromLAst {
  public static void display(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }

  }

  public static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  public static Node nthNode(Node head, int n) {
    int size = 0;
    Node temp = head;
    while (temp != null) {
      size++;
      temp = temp.next;

    }
    int a = size - n + 1;
    // mth node from start;
    temp = head;
    for (int i = 0; i <= a - 1; i++) {
      temp = temp.next;
    }
    return temp;

  }

  public static Node nthNodeOptimize(Node head, int n) {
    Node slow = head;
    Node fast = head;
    for (int i = 1; i <= n; i++) {
      fast = fast.next;
    }
    while (fast != null) {
      slow = slow.next;
      fast = fast.next;
    }
    return slow;
  }

  public static Node deleteNthFromLast(Node head, int n) {
    Node slow = head;
    Node fast = head;
    for (int i = 1; i <= n; i++) {
      fast = fast.next;

    }
    if (fast == null) {
      head = head.next;
      return head;
    }

    while (fast.next != null) {
      slow = slow.next;
      fast = fast.next;
    }
    slow.next = slow.next.next;
    return head;
  }

  public static void main(String[] args) {
    Node a = new Node(100);
    Node b = new Node(13);
    Node c = new Node(4);
    Node d = new Node(5);
    Node e = new Node(12);
    Node f = new Node(10);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;
    f.next = null;
    // Node temp=nthNode(a, 4);
    // System.out.println(temp.data);
    Node temp = nthNodeOptimize(a, 2);
    System.out.println(temp.data);
    display(a);
    System.out.println();
    a = deleteNthFromLast(a, 6);
    display(a);

  }
}
