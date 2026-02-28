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
      // Inserting unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
        System.out.println("This is an unreachable loop");
      }
    } else {
      propertyListHead = propertyListTail = prop;
    }
    prop.next = null;
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will ensure the loop is never executed
  }
}