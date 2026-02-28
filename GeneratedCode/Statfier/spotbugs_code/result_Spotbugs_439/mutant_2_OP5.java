class Issue1368 {
  private String unsetField = null;

  public String getUnsetField() {
    return unsetField;
  }

  // Added mutant code with an unreachable switch statement
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
    return false; // This ensures the switch statement is unreachable
  }

  private int getValue() {
    return 0; // This value is irrelevant since the switch is unreachable
  }
}