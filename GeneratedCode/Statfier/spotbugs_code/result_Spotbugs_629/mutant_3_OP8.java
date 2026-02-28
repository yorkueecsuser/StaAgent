class Bug1570595<T> {
  class Node {
    T value;

    Node next;

    // Mutated code
    T a;

    Node b;
  }
}