class InnerClassOfParameterizedType<T> {
  class Node {
    T value;

    Node next;

    // Added mutant code
    boolean getCondition() {
      return false;
    }

    void someMethod() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch.");
      }
    }
  }
}