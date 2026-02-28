class SomeLibrary {

  class $$Z {}

  T t;

  T get() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return t == null? null : t;
  }

  private boolean getCondition() {
    return false; // This ensures the condition is always false at runtime, making the loop unreachable
  }
}