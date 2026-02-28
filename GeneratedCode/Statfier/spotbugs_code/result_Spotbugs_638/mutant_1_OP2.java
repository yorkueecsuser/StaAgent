class InnerClassOfParameterizedType<T> {
  class Node {
    T value;

    Node next;

    // Original assignment statements
    value = null;
    next = null;

    // Mutated assignment statements (duplicates)
    value = null; // Duplicate of value = null;
    next = null;  // Duplicate of next = null;
  }
}