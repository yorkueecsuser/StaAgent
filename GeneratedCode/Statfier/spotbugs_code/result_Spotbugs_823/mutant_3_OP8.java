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
    
    // Mutant code with renaming
    Node a = propertyListTail;
    Node b = propertyListHead;
    if (a!= null) {
      a.next = prop;
      a = prop;
    } else {
      b = a = prop;
    }
    prop.next = null;
  }
}