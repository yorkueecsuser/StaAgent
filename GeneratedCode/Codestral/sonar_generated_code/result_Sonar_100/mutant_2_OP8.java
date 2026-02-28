class BuggyClass {

  private String nonNullField;

  public BuggyClass(String color) {
    nonNullField = color;
  }

  public String buggyMethod() {
    String mix = null;
    return mix; // BUG: "@NonNull" values should not be set to null
  }

  public String showBug() {
    BuggyClass bc = new BuggyClass(null);
    // Mutant: Renamed 'bc' to 'r'
    BuggyClass r = new BuggyClass(null);
    return r.buggyMethod();
  }
}