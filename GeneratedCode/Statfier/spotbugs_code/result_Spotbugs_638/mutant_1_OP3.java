class InnerClassOfParameterizedType<T> {
  class Node {
    T value;

    Node next;

    // Added mutant code with an unreachable if statement
    boolean getCondition() {
      return false;
    }

    void someMethod() {
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable
        System.out.println("This is an unreachable statement.");
      }
    }
  }
}