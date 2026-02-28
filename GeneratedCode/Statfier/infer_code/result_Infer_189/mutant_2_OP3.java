import javax.annotation.Nullable;

class SomeExternalClass {
  public Object field;

  public Object externalMethod1() {
    return null;
  }

  public void externalMethod2(@Nullable Object object) {}

  // Inserting an unreachable if statement
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will run if condition is true
      System.out.println("This will run if condition is true.");
    }
    // Unreachable if statement
    boolean unreachableCondition = falseCondition();
    if (unreachableCondition) {
      // This block is unreachable
      System.out.println("This is an unreachable statement.");
    }
  }

  private boolean getCondition() {
    // Return a dynamic condition
    return Math.random() > 0.5;
  }

  private boolean falseCondition() {
    // Always returns false, but not a compile-time constant
    return false;
  }
}