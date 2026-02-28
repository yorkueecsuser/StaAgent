class BuggyClass {

  private String nonNullField;

  public BuggyClass(String color) {
    nonNullField = color;
  }

  public String buggyMethod() {
    String mix = null;
    // Mutation: Added an unreachable while loop
    boolean unreachableCondition = false;
    while (unreachableCondition) {
      // This code will never execute
      System.out.println("This is an unreachable statement");
    }
    return mix;
  }

  public String showBug() {
    BuggyClass bc = new BuggyClass(null);
    return bc.buggyMethod();
  }
}