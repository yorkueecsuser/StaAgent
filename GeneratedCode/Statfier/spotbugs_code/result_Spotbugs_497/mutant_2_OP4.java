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
    // Introduced an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable block in the constructor.");
    } else {
      // This block will always execute
      System.out.println("This is the reachable block in the constructor.");
    }
  }

  public void add(int x) {
    Node temp = tail;
    tail = new Node(x);
    temp.next = tail;
    // Introduced an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable block in the add method.");
    } else {
      // This block will always execute
      System.out.println("This is the reachable block in the add method.");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}