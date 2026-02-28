class SomeLibrary {

  class $$Z {}

  T t;

  T get() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
    return t == null? null : t;
  }

  private boolean getCondition() {
    return false; // This method ensures that the conditionFor is always false at runtime
  }
}