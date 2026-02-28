class BuggyClass {

  private String nonNullField;

  public BuggyClass(String color) {
    nonNullField = color;
  }

  public String buggyMethod() {
    String mix = null;
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      // Unreachable branch added
      System.out.println("This is an unreachable branch.");
    }
    return mix;
  }

  public String showBug() {
    BuggyClass bc = new BuggyClass(null);
    return bc.buggyMethod();
  }

  // Dummy method for unreachable condition
  private boolean getCondition() {
    return false;
  }
}