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

    // Introduced unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      propertyListHead.value = new Object();
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, making the if block unreachable
  }
}