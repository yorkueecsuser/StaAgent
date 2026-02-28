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
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because getCondition() returns false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case to ensure switch is not empty
        break;
    }
  }

  public void add(int x) {
    Node temp = tail;
    tail = new Node(x);
    temp.next = tail;
    // Introduced another unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because getCondition() returns false
        System.out.println("Another unreachable case.");
        break;
      default:
        // Default case to ensure switch is not empty
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}