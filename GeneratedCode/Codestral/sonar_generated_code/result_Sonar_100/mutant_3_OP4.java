class BuggyClass {

  private String nonNullField;

  public BuggyClass(String color) {
    nonNullField = color;
  }

  public String buggyMethod() {
    String mix = null;
    boolean shouldNotRun = false; // Unreachable if-else statement mutation
    if (shouldNotRun) {
      mix = nonNullField; // This branch is unreachable
    } else {
      mix = "default"; // This branch is always executed
    }
    return mix;
  }

  public String showBug() {
    BuggyClass bc = new BuggyClass(null);
    return bc.buggyMethod();
  }

  private boolean getCondition() { // Dummy method to generate a dynamic condition
    return false;
  }
}