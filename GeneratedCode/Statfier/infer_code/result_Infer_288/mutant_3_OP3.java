class SomeLibrary {

  class $$Z {}

  T t;

  T get() {
    return t == null? null : t;
  }

  // Mutant code added here
  boolean getCondition() {
    return false;
  }

  void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This will never be printed");
    }
  }
}