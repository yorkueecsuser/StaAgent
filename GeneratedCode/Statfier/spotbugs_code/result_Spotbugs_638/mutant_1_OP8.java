class InnerClassOfParameterizedType<T> {
  class Node {
    T value;

    Node next;

    // Mutant 1: Renaming 'value' to 'a'
    T a;

    // Mutant 2: Renaming 'next' to 'b'
    Node b;
  }
}