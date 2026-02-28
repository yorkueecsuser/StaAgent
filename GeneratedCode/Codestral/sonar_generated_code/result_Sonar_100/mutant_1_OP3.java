class BuggyClass {

  private String nonNullField;

  public BuggyClass(String color) {
    nonNullField = color;
  }

  private boolean isUnreachableCondition() {
    return false;
  }

  public String buggyMethod() {
    String mix = null;
    if (isUnreachableCondition()) {
      System.out.println("This line should never execute");
    }
    return mix; // BUG: "@NonNull" values should not be set to null
  }

  public String showBug() {
    BuggyClass bc = new BuggyClass(null);
    return bc.buggyMethod();
  }
}