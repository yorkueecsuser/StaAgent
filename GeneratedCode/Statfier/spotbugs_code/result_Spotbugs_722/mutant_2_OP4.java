class EqualToAString {

  final String name;

  public EqualToAString(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    // Introduced an unreachable if-else statement with a dynamic condition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always execute
      System.out.println("This block will always execute");
    }

    if (o instanceof EqualToAString) return name.equals(((EqualToAString) o).name);
    if (o instanceof String) {
      return name.equals(o);
    }
    return false;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}