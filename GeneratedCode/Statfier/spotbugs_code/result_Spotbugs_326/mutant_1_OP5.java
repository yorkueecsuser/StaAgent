public enum Bug1619879 {
  ONE,
  TWO;

  int f;

  // should report something other than EQ_SELF_NO_OBJECT
  public boolean equals(Bug1619879 foo) {
    return f == foo.f;
  }

  // Introduced mutant with an unreachable switch statement
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      int value = getValue();
      switch (value) {
        case 1:
          System.out.println("This is case 1");
          break;
        case 2:
          System.out.println("This is case 2");
          break;
        default:
          System.out.println("Default case");
          break;
      }
    }
  }

  private boolean getCondition() {
    return false; // This ensures the condition is always false, making the switch unreachable
  }

  private int getValue() {
    return 0; // This value is irrelevant since the switch is unreachable
  }
}