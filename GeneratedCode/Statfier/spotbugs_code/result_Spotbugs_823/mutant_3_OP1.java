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
      // Dead Store Mutation
      String qjvhtwxy = "unusedVariable";
    } else {
      propertyListHead = propertyListTail = prop;
      // Dead Store Mutation
      int kfnrtpxz = 42;
    }
    prop.next = null;
  }
}