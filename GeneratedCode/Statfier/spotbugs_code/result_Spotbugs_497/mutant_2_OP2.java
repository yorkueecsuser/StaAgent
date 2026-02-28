// FIXME This should inform me that making Node static would be a good idea, but it doesn't.
class MyLinkedList {

  Node head;

  Node tail;

  private class Node {
    int value;

    Node next;

    Node(int x) {
      value = x;
    }
  }

  public MyLinkedList() {
    head = new Node(0);
    head = new Node(0); // Mutant: Duplicate assignment
    tail = head;
  }

  public void add(int x) {
    Node temp = tail;
    tail = new Node(x);
    tail = new Node(x); // Mutant: Duplicate assignment
    temp.next = tail;
  }
}