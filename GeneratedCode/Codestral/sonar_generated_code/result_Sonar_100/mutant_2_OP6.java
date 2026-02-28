class BuggyClass {

  private String nonNullField;

  public BuggyClass(String color) {
    nonNullField = color;
  }

  public String buggyMethod() {
    String mix = null;
    boolean condition = getCondition();
    // Mutant: Inserted unreachable for loop
    for (int i = 0; condition; i++) {
        // This loop is unreachable
        System.out.println("Inside unreachable loop");
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