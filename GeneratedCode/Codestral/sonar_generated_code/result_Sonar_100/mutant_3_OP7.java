class BuggyClass {

  private String nonNullField;

  public BuggyClass(String color) {
    nonNullField = color;
  }

  public String buggyMethod() {
    String mix = null;
    boolean unreachableCondition = false;
    while (unreachableCondition) {
        // Unreachable while loop
        System.out.println("This is an unreachable code block");
    }
    return mix; // BUG: "@NonNull" values should not be set to null
  }

  public String showBug() {
    BuggyClass bc = new BuggyClass(null);
    return bc.buggyMethod();
  }
}