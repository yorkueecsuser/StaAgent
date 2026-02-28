class Bug1570595<T> {
  class Node {
    T value;

    Node next;

    // Added mutant code with an unreachable if statement
    public void someMethod() {
      boolean condition = getCondition();
      if (condition) {
        // Some code that will run if condition is true
      }
      // Unreachable if statement
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        // This block is unreachable because getUnreachableCondition() always returns false
      }
    }

    private boolean getCondition() {
      return true; // Example condition that can be true at runtime
    }

    private boolean getUnreachableCondition() {
      return false; // This method always returns false, making the if block unreachable
    }
  }
}