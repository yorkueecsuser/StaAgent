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
    // Introduced an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  public void add(int x) {
    Node temp = tail;
    tail = new Node(x);
    temp.next = tail;
    // Introduced another unreachable if statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("Another unreachable statement.");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, ensuring the if blocks are unreachable
  }
}