class InnerClassOfParameterizedType<T> {
  class Node {
    T value;

    Node next;

    // Dead Store Mutation
    String abcdefgh = "unusedVariable";
  }
}