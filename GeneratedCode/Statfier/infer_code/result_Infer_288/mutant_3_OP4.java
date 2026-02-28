class SomeLibrary {

  class $$Z {}

  T t;

  T get() {
    return t == null? null : t;
  }

  // Added mutant code with an unreachable if-else statement
  boolean getCondition() {
    return false; // This method will always return false, but it's not a compile-time constant
  }

  void someMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if getCondition() returns true
      System.out.println("This is reachable");
    } else {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is unreachable");
    }
  }
}