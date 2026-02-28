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
    // Introduced an unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse? 1 : 0) {
      case 1:
        // This case is unreachable because alwaysFalse is always false
        System.out.println("This will never be printed");
        break;
    }
  }

  public void add(int x) {
    Node temp = tail;
    tail = new Node(x);
    temp.next = tail;
    // Introduced another unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse? 2 : 0) {
      case 2:
        // This case is unreachable because alwaysFalse is always false
        System.out.println("This will also never be printed");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}