class Bug1570595<T> {
  class Node {
    T value;

    Node next;

    // Introduced Dead Store mutation
    String qzjxtpnr;
  }
}