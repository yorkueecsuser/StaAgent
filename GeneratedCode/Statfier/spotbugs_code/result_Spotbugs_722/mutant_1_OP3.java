class EqualToAString {

  final String name;

  public EqualToAString(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    // Introduced an unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      System.out.println("This is an unreachable block");
    }

    if (o instanceof EqualToAString) return name.equals(((EqualToAString) o).name);
    if (o instanceof String) {
      return name.equals(o);
    }
    return false;
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}