class InnerClassOfParameterizedType<T> {
  class Node {
    T value;

    Node next;

    // Added mutant code following the mutation operator description
    boolean getCondition() {
      return false; // This method will always return false, making the if-else branch unreachable
    }

    void someMethod() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Code that will never execute
        System.out.println("This is unreachable code.");
      } else {
        // Alternative code that will always execute
        System.out.println("This is reachable code.");
      }
    }
  }
}