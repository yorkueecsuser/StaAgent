class Bug3460132 {

  String index = String.format("%2147483648$g", 42.0);
  String width = String.format("%2147483648g", 42.0);
  String precision = String.format("%.2147483648g", 42.0);

  // Inserting an unreachable switch statement
  public void someMethod() {
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is never reached");
        break;
      case 2:
        System.out.println("This is also never reached");
        break;
      default:
        System.out.println("Default case, still not reached");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the switch is unreachable
  }

  private int getValue(boolean condition) {
    if (condition) {
      return 1; // This will never be true
    } else {
      return 0; // This will always be true, but the switch cases are still unreachable due to the logic
    }
  }
}