class BuggyClass {

  private String nonNullField;

  public BuggyClass(String color) {
    nonNullField = color;
  }

  public String buggyMethod() {
    String mix = null;
    int unreachableValue = getUnreachableValue(); // Non-final variable as the switch expression
    switch(unreachableValue) { // Unreachable switch statement
      case 1:
        // Unreachable code
        break;
    }
    return mix;
  }

  public String showBug() {
    BuggyClass bc = new BuggyClass(null);
    return bc.buggyMethod();
  }

  private int getUnreachableValue() {
    return -1; // Always returns a value that is not included in the case statements
  }
}