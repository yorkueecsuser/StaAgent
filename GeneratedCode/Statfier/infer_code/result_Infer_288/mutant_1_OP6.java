class SomeLibrary {

  class $$Z {}

  T t;

  T get() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will be false at runtime
    }
    return t == null? null : t;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}