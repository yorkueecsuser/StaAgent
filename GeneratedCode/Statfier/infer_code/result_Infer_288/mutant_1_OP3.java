class SomeLibrary {

  class $$Z {}

  T t;

  T get() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This will never be printed");
    }
    return t == null? null : t;
  }

  private boolean getCondition() {
    // This method always returns false, making the if statement unreachable
    return false;
  }
}