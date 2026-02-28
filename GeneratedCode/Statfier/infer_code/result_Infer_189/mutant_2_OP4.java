import javax.annotation.Nullable;

class SomeExternalClass {
  public Object field;

  public Object externalMethod1() {
    return null;
  }

  public void externalMethod2(@Nullable Object object) {
    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Code that will run if shouldRun is true
      System.out.println("This code will run if shouldRun is true.");
    } else {
      // Unreachable code due to shouldRun always being false
      System.out.println("This code is unreachable.");
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the else block unreachable
    return false;
  }
}