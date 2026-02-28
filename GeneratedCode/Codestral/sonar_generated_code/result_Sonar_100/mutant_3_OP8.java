class BuggyClass {

  private String nonNullField;
  private String renamedField; // Mutant: Added a renamed field

  public BuggyClass(String color) {
    nonNullField = color;
    renamedField = color; // Mutant: Initialized the renamed field
  }

  public String buggyMethod() {
    String mix = null;
    return mix; // BUG: "@NonNull" values should not be set to null
  }

  public String showBug() {
    BuggyClass bc = new BuggyClass(null);
    return bc.buggyMethod();
  }

  public String mutantMethod() { // Mutant: Added a new method
    String renamedMix = null;
    return renamedMix; // Mutant: Using the renamed variable instead of'mix'
  }
}