class BuggyClass {

  private String nonNullField;
  private String a;

  public BuggyClass(String color) {
    a = color; // Mutant: Renamed nonNullField to a
  }

  public String buggyMethod() {
    String mix = null;
    return mix; // BUG: "@NonNull" values should not be set to null
  }

  public String showBug() {
    BuggyClass bc = new BuggyClass(null);
    return bc.buggyMethod();
  }

  // New method with renamed variable
  public String newMethod() {
    String b = null;
    return b; // Mutant: Renamed mix to b
  }
}