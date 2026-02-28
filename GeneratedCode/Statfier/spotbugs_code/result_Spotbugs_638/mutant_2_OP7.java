class InnerClassOfParameterizedType<T> {
  class Node {
    T value;

    Node next;

    // Inserting an unreachable while loop
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