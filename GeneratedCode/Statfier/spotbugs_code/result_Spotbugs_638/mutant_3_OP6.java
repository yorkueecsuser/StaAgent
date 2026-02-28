class InnerClassOfParameterizedType<T> {
  class Node {
    T value;

    Node next;

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined but always returns false
    }
  }
}