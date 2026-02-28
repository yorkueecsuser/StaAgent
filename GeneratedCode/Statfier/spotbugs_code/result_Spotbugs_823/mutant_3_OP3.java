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

    // Inserting an unreachable if branch
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is unreachable because getUnreachableCondition() always returns false
      propertyListHead.value = new Object();
    }
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}