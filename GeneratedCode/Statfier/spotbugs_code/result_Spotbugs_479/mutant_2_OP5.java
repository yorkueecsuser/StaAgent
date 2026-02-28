class Bug3460132 {

  String index = String.format("%2147483648$g", 42.0);
  String width = String.format("%2147483648g", 42.0);
  String precision = String.format("%.2147483648g", 42.0);

  // Added mutant code with an unreachable switch statement
  public void mutantMethod() {
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is reachable");
        break;
      case 2:
        System.out.println("This is also reachable");
        break;
      default:
        // This switch will never reach this case due to the condition
        System.out.println("This is unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This ensures the condition is dynamically determined but always false
  }

  private int getValue(boolean condition) {
    if (condition) {
      return 2;
    } else {
      return 1;
    }
  }
}