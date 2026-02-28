class GuaranteedFieldDereference4 {
  static class Node {
    public Object value;

    public Node next;
  }

  public Node propertyListTail, propertyListHead;

  void falsePositive(Node prop) {
    if (propertyListTail!= null) {
      propertyListTail.next = prop;
      propertyListTail.next = prop; // Mutant: duplicated assignment
      propertyListTail = prop;
      propertyListTail = prop; // Mutant: duplicated assignment
    } else {
      propertyListHead = propertyListTail = prop;
      propertyListHead = propertyListTail = prop; // Mutant: duplicated assignment
    }
    prop.next = null;
    prop.next = null; // Mutant: duplicated assignment
  }
}