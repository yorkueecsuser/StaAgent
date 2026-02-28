class CloneIdiom3 implements Cloneable {
  @Override
  public Object clone() {
    // Original code
    return new CloneIdiom3();

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable statement.");
    }
  }

  private boolean getCondition() {
    // Always return false to ensure the if block is unreachable
    return false;
  }
}