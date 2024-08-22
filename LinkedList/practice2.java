public class practice2 {
  public static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;

    }
  }

  public static class LinkedList11 {
    Node head = null;
    Node tail = null;
    int size = 0;

    void insertAtEnd(int data) {
      Node temp = new Node(data);
      if (head == null) {
        head = tail = temp;

      } else {
        tail.next = temp;
        tail = temp;
      }
      size++;
    }

    void insertAtstart(int data) {
      Node temp = new Node(data);
      if (head == null) {
        return;
      } else {
        temp.next = head;
        head = temp;
      }
      size++;

    }

    void inserAt(int idx, int value) {
      Node newNode = new Node(value);
      Node temp = head;
      if (idx == 0) {
        insertAtstart(value);
        return;
      }
      if (idx == size) {
        insertAtEnd(value);
        return;
      }

      for (int i = 1; i <= idx - 1; i++) {
        temp = temp.next;
      }
      newNode.next = temp.next;
      temp.next = newNode;
      size++;

    }

    void deletAtIndex(int index) {
      if (head == null)
        return;
      if (index == 0) {
        head.next = head;
      } else {
        Node temp = head;
        for (int i = 1; i < index; i++) {
          temp = temp.next;
        }
        temp.next = temp.next.next;
        if (index == size - 1) {
          tail = temp;
        }
        if (index < 0 && index > size - 1) {
          System.out.println("enter corect value of index");
        }
        size--;
      }
    }

    void display() {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;

      }
    }

    public static void main(String[] args) {
      LinkedList11 ll = new LinkedList11();
      ll.insertAtEnd(1);
      ll.insertAtEnd(2);
      ll.insertAtEnd(3);
      ll.insertAtEnd(4);
      ll.insertAtEnd(5);

      ll.deletAtIndex(3);
      ll.display();

    }
  }
}