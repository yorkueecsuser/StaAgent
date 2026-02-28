class BuggyClass {

  private String nonNullField;

  public BuggyClass(String color) {
    nonNullField = color;
  }

  // Method to return an unreachable value
  private int getUnreachableValue() {
    return 0;
  }

  public String buggyMethod() {
    String mix = null;

    // Inserting unreachable switch statement
    switch (getUnreachableValue()) {
      case 1:
        mix = "This case will never be reached";
        break;
    }

    return mix;
  }

  public String showBug() {
    BuggyClass bc = new BuggyClass(null);
    return bc.buggyMethod();
  }
}