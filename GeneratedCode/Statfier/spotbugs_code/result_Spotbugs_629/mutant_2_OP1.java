class Bug1570595<T> {
  class Node {
    T value;

    Node next;

    // Dead Store Mutation
    String jxqfvtbn = "unusedVariable";
  }
}