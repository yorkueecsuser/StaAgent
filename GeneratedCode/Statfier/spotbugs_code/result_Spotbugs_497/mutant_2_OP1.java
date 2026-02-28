// FIXME This should inform me that making Node static would be a good idea, but it doesn't.
class MyLinkedList {

  Node head;

  Node tail;

  private class Node {
    int value;

    Node next;

    Node(int x) {
      value = x;
      // Dead Store Mutation
      String qvbnrhty = "unusedVariable";
    }
  }

  public MyLinkedList() {
    head = new Node(0);
    tail = head;
    // Dead Store Mutation
    int wxyzabcd = 42;
  }

  public void add(int x) {
    Node temp = tail;
    tail = new Node(x);
    temp.next = tail;
    // Dead Store Mutation
    boolean jklmnopq = true;
  }
}