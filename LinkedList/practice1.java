/**
 * practice1
 */
public class practice1 {
  public static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  public static class LinkedList1 {
    Node head = null;
    Node tail = null;
    int size = 0;

    void inserAtEnd(int val) {
      Node temp = new Node(val);
      if (head == null) {
        head = temp;
        tail = temp;

      } else {
        tail.next = temp;
        tail = temp;
      }

      size++;
    }

    void inserAtStart(int val) {
      Node temp = new Node(val);
      if (head == null) {
        head = temp;
        tail = temp;
      } else {
        temp.next = head;
        head = temp;
      }

      size++;

    }

    void insertAtindex(int index, int val) {
      Node newNode = new Node(val);
      Node temp = head;
      if (index == 0) {
        inserAtStart(val);
      }
      if (index == size) {
        inserAtEnd(val);
      }

      else {
        for (int i = 1; i <= index; i++) {
          newNode.next = temp.next;
          temp.next = newNode;

        }
        size++;

      }

    }

    void display() {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;

      }
    }

    void deletAtIndex(int idx) {

      if (head == null) {
        return;
      }
      if (idx == 0) {
        head = head.next;
        return;
      }
      if (idx < 0 && idx > size) {
        System.out.println("plese eneter correct index");
      } else {
        Node temp = head;

        for (int i = 1; i < idx; i++) {
          temp = temp.next;
        }

        temp.next = temp.next.next;
        if (idx == size - 1) {
          tail = temp;
        }
      }

      size--;

    }

    void deletAll() {
      head = null;
      tail = null;
      size = 0;
    }

    void size() {
      System.out.println("current size of linkedlist :" + size);
    }

  }

  public static void main(String[] args) {
    LinkedList1 l2 = new LinkedList1();
    l2.inserAtEnd(1);
    l2.inserAtEnd(3);
    l2.inserAtEnd(5);

    l2.display();// 1 3 5
    System.out.println();
    l2.deletAtIndex(0);
    l2.display();// 3 5
    l2.deletAll();
    l2.size();// current size of linkedlist :0

  }

}