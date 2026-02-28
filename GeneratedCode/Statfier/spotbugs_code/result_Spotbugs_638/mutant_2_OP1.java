class InnerClassOfParameterizedType<T> {
  class Node {
    T value;

    Node next;

    // Mutant code added for Dead Store mutation
    String ijklmnop;
  }
}