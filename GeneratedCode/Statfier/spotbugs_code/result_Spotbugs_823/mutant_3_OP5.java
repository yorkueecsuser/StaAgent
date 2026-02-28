class GuaranteedFieldDereference4 {
  static class Node {
    public Object value;

    public Node next;
  }

  public Node propertyListTail, propertyListHead;

  void falsePositive(Node prop) {
    boolean condition = getCondition();
    if (propertyListTail!= null) {
      propertyListTail.next = prop;
      propertyListTail = prop;
      // Unreachable switch statement
      switch(getValue()) {
        case 1:
          // This case is unreachable because getValue() never returns 1
          System.out.println("This is unreachable");
          break;
        default:
          // Default case to avoid compiler warning
          break;
      }
    } else {
      propertyListHead = propertyListTail = prop;
    }
    prop.next = null;
  }

  private boolean getCondition() {
    return false;
  }

  private int getValue() {
    return 0;
  }
}