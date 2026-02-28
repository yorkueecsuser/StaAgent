class InnerClassOfParameterizedType<T> {
  class Node {
    T value;

    Node next;

    // Mutant code added here
    boolean getCondition() {
      return false; // This method will always return false, ensuring the if-else is unreachable
    }

    void someMethod() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is unreachable
        System.out.println("This is an unreachable block");
      } else {
        // This block is also unreachable because the if condition is always false
        System.out.println("This is another unreachable block");
      }
    }
  }
}