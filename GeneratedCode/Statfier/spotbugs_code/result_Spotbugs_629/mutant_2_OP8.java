class Bug1570595<T> {
  class Node {
    T value;

    Node next;
    
    // Mutant code
    T a;
    Node b;
  }
}