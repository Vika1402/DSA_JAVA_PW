public class LinkedList_Implementaion {
  public static class Node {
    int data;
    Node next;

    Node(int value) {
      this.data = value;

    }
  }

  public static class linkedList {
    Node head = null;
    Node tail = null;
    int size = 0;

    // inser elimenet from back
    void inserAtEnd(int value) {
      Node temp = new Node(value);
      if (head == null) {
        head = temp;
        tail = temp;
      } else {
        tail.next = temp;
        tail = temp;
      }
      size++;

    }
    // inser elimenet from start

    void inserAtBegining(int val) {
      Node temp = new Node(val);
      if (head == null) {
        head = tail = temp;
      } else {
        temp.next = head;
        head = temp;
      }
      size++;
    }

    // print ll eliments
    void display() {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;

      }
    }

    void inserAt(int idx, int value) {
      Node newNode = new Node(value);
      Node temp = head;
      if (idx == 0) {
        inserAtBegining(value);
        return;
      }
      if (idx == size) {
        inserAtEnd(value);
        return;
      }

      for (int i = 1; i <= idx; i++) {
        temp = temp.next;
      }
      newNode.next = temp.next;
      temp.next = newNode;
      size++;

    }

    void getAt(int index) {
      Node temp = head;

      for (int i = 0; i <= index - 1; i++) {
        temp = temp.next;
      }
      System.out.println(temp.data);

    }

    // display the size of ll
    void size() {
      System.out.println(size);
    }

    void deleteAtIndex(int index) {
      if (head == null) {
        return;
      }
      if (index == 0) {
        head = head.next;
      } else {
        Node temp = head;
        for (int i = 1; i < index; i++) {
          temp = temp.next;
        }
        temp.next = temp.next.next;
        if (index == size - 1) {
          tail = temp;
        }
      }
      size--;
    }

    void deleteAll() {
      head = null;
      tail = null;
      size = 0;
      System.out.println("All elements deleted");
    }
  }

  public static void main(String[] args) {
    linkedList ll = new linkedList();
    ll.inserAtEnd(1);

    ll.inserAtEnd(3);

    ll.inserAtEnd(5);

    ll.inserAtEnd(7);

    ll.deleteAtIndex(0);
    ll.size();

  }
}
