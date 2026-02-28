class Bug1570595<T> {
  class Node {
    T value;

    Node next;

    // Original assignment statement
    value = null;
    // Mutated assignment statement (duplicated and inserted immediately after)
    value = null;
  }
}