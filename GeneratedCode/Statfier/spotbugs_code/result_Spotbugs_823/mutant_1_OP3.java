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

    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      propertyListHead = null;
      propertyListTail = null;
    }
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the if block is unreachable
    return false;
  }
}