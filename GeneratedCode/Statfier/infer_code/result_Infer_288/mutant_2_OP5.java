class SomeLibrary {

  class $$Z {}

  T t;

  T get() {
    return t == null? null : t;
  }

  // Introduced mutant code with an unreachable switch statement
  boolean getCondition() {
    return false;
  }

  void someMethod() {
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is unreachable because getCondition() always returns false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // This is the only reachable case
        System.out.println("This is the reachable default case.");
        break;
    }
  }
}