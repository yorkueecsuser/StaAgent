class Bug1570595<T> {
  class Node {
    T value;

    Node next;
    
    // Introduced an unreachable while loop according to the mutation operator
    boolean getCondition() {
      return false;
    }

    void someMethod() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() always returns false
        System.out.println("This is an unreachable loop");
      }
    }
  }
}