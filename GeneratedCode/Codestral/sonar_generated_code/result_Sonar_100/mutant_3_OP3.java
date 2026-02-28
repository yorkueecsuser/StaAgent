class BuggyClass {

  private String nonNullField;

  public BuggyClass(String color) {
    nonNullField = color;
  }

  public String buggyMethod() {
    String mix = null;
    if (getCondition()) {
      // Unreachable code
      mix = "unreachable";
    }
    return mix; // BUG: "@NonNull" values should not be set to null
  }

  private boolean getCondition() {
    return false;
  }

  public String showBug() {
    BuggyClass bc = new BuggyClass(null);
    return bc.buggyMethod();
  }
}