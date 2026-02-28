class InnerClassOfParameterizedType<T> {
  class Node {
    T value;

    Node next;

    // Added unreachable for loop according to the mutation operator
    boolean getCondition() {
      return false;
    }

    void someMethod() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable code
      }
    }
  }
}