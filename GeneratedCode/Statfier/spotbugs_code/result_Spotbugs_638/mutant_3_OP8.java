class InnerClassOfParameterizedType<T> {
  class Node {
    T value;

    Node next;

    // Mutant code
    T x; // Renamed 'value' to 'x'
    Node y; // Renamed 'next' to 'y'
  }
}