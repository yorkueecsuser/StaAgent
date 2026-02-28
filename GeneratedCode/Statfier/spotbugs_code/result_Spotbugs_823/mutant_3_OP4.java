class GuaranteedFieldDereference4 {
  static class Node {
    public Object value;

    public Node next;
  }

  public Node propertyListTail, propertyListHead;

  void falsePositive(Node prop) {
    if (propertyListTail!= null) {
      propertyListTail.next = prop;
      propertyListTail = prop;
    } else {
      propertyListHead = propertyListTail = prop;
    }
    prop.next = null;

    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is intended to be unreachable
      propertyListHead.value = new Object();
    } else {
      // This block is also intended to be unreachable
      propertyListTail.value = new Object();
    }
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}