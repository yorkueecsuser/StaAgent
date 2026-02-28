class InnerClassOfParameterizedType<T> {
  class Node {
    T value;

    Node next;

    // Introduced an unreachable for loop according to the mutation operator
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }

    // Method to simulate dynamic determination of condition
    private boolean getCondition() {
      return false;
    }
  }
}