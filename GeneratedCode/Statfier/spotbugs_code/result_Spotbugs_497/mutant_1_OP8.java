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
  private class Node {
    int a;

    Node b;

    Node(int y) {
      a = y;
    }
  }

  public MyLinkedList() {
    head = new Node(0);
    tail = head;
  }

  public void add(int z) {
    Node c = tail;
    tail = new Node(z);
    c.b = tail;
  }
}