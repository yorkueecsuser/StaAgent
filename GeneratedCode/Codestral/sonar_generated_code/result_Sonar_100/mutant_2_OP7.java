class BuggyClass {

  private String nonNullField;

  private boolean getCondition() {
    return false;
  }

  public BuggyClass(String color) {
    nonNullField = color;
  }

  public String buggyMethod() {
    String mix = null;
    while (getCondition()) { // Mutant: Unreachable while loop
      System.out.println("This is an unreachable block."); // This line is added for demonstration purposes, not required for the mutant
    }
    return mix;
  }

  public String showBug() {
    BuggyClass bc = new BuggyClass(null);
    return bc.buggyMethod();
  }
}