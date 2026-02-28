class InnerClassOfParameterizedType<T> {
  class Node {
    T value;

    Node next;

    // Mutated code starts here
    boolean getCondition() {
      return false;
    }

    void someMethod() {
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable
        System.out.println("This is an unreachable if statement");
      }
    }
    // Mutated code ends here
  }
}