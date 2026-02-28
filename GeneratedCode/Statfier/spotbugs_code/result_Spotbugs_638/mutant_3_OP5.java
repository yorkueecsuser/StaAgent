class InnerClassOfParameterizedType<T> {
  class Node {
    T value;

    Node next;

    // Inserting an unreachable switch statement
    boolean getUnreachableCondition() {
      return false;
    }

    void someMethod() {
      boolean condition = getUnreachableCondition();
      switch (condition) {
        case true:
          // This case is unreachable because getUnreachableCondition() always returns false
          System.out.println("This will never be printed");
          break;
        default:
          // Default case is also unreachable due to the same reason
          System.out.println("This will also never be printed");
          break;
      }
    }
  }
}