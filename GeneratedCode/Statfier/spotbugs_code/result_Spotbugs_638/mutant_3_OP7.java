class InnerClassOfParameterizedType<T> {
  class Node {
    T value;

    Node next;

    // Introduced an unreachable while loop according to the mutation operator
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() should return false
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}