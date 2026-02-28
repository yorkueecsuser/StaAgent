class EqualToAString {

  final String name;

  public EqualToAString(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof EqualToAString) return name.equals(((EqualToAString) o).name);
    if (o instanceof String) {
      return name.equals(o);
    }
    // Mutant code: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is unreachable because shouldRun is never set to true
      System.out.println("This is an unreachable block");
    } else {
      // This block is also unreachable because shouldRun is never set to true
      System.out.println("This is another unreachable block");
    }
    return false;
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the if-else block is unreachable
    return false;
  }
}