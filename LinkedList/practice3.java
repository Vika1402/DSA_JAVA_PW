public class practice3 {
  public static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  public static class LinkedList2 {
    Node head = null;
    Node tail = null;
    int size = 0;

    void inserAtLast(int data) {
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

    void inserAtStart(int data) {
      Node temp = new Node(data);
      if (head == null) {

        return;

      }
      temp.next = head;
      head = temp;

      size++;

    }

    void innserAtindex(int idx, int val) {
      Node newNode = new Node(val);
      Node temp = head;
      if (idx == 0) {
        inserAtStart(val);
        return;
      }
      if (idx == size) {
        inserAtLast(val);
      } else {
        for (int i = 1; i < idx; i++) {
          temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

      }

    }

    void display() {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;

      }

    }
  }

  public static void main(String[] args) {
    LinkedList2 ll = new LinkedList2();
    ll.inserAtLast(2);
    ll.inserAtLast(4);
    ll.inserAtLast(6);
    ll.inserAtLast(8);
    ll.inserAtLast(10);
    // ll.inserAtStart(23); 23 2 4 6 8 10
    ll.display();
    System.out.println();
    ll.innserAtindex(3, 12);
    ll.display();
  }
}
