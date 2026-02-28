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
    head = new Node(0); // Mutant: duplicated assignment
    tail = head;
  }

  public void add(int x) {
    Node temp = tail;
    temp = tail; // Mutant: duplicated assignment
    tail = new Node(x);
    temp.next = tail;
  }
}