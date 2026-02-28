class BuggyClass {

  private String nonNullField;

  public BuggyClass(String color) {
    nonNullField = color;
  }

  public String buggyMethod() {
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
        // This part of the code is unreachable
        System.out.println("Unreachable code");
    }

    String mix = null;
    return mix; // BUG: "@NonNull" values should not be set to null
  }

  public String showBug() {
    BuggyClass bc = new BuggyClass(null);
    return bc.buggyMethod();
  }

  // Method to provide a run-time condition for the for loop
  private boolean getCondition() {
    return false; // Always return false to make the loop unreachable
  }
}