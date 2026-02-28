class BuggyClass {

  private String nonNullField;

  public BuggyClass(String color) {
    nonNullField = color;
  }

  private boolean getFalseCondition() {
    return false;
  }

  public String buggyMethod() {
    String mix = null;
    if (getFalseCondition()) { // Mutant: Unreachable if statement
      throw new IllegalStateException("Unreachable code executed");
    }
    return mix;
  }

  public String showBug() {
    BuggyClass bc = new BuggyClass(null);
    return bc.buggyMethod();
  }
}