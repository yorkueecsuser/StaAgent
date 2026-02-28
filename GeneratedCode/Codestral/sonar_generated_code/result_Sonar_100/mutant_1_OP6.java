class BuggyClass {

  private String nonNullField;

  public BuggyClass(String color) {
    nonNullField = color;
  }

  public String buggyMethod() {
    String mix = null;
    boolean condition = false;
    for (int i = 0; condition; i++) {
        // Unreachable code
        System.out.println("This line should not be executed.");
    }
    return mix;
  }

  public String showBug() {
    BuggyClass bc = new BuggyClass(null);
    return bc.buggyMethod();
  }
}