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
      System.out.println("This line should never be executed.");
    } else {
      // Original code left unchanged
      return mix;
    }
  }

  public String showBug() {
    BuggyClass bc = new BuggyClass(null);
    return bc.buggyMethod();
  }

  // Helper method to dynamically determine the condition
  private boolean getCondition() {
    // Replace this with your actual condition
    return Math.random() > 0.5;
  }
}