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
    tail = head;
  }

  public void add(int x) {
    Node temp = tail;
    tail = new Node(x);
    temp.next = tail;
  }

  // Mutated code
  public void add(int y) {
    Node b = tail;
    tail = new Node(y);
    b.next = tail;
  }
}