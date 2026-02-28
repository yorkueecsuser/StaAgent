import javax.annotation.Nullable;

class SomeExternalClass {
  public Object field;

  public Object externalMethod1() {
    return null;
  }

  public void externalMethod2(@Nullable Object object) {}

  // Introduced unreachable switch statement
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some existing code
    }

    // Unreachable switch statement
    int unreachableValue = getUnreachableValue();
    switch (unreachableValue) {
      case 1:
        System.out.println("This is unreachable case 1");
        break;
      case 2:
        System.out.println("This is unreachable case 2");
        break;
      default:
        System.out.println("This is unreachable default case");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This ensures the if block is also unreachable, maintaining the original behavior
  }

  private int getUnreachableValue() {
    return 0; // This ensures the switch statement is unreachable
  }
}