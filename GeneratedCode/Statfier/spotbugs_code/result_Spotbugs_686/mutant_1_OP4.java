class CloneIdiom3 implements Cloneable {
  @Override
  public Object clone() {
    // Original code
    return new CloneIdiom3();

    // Mutated code - Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() returns false
      System.out.println("This is an unreachable block");
    } else {
      // This block will also never execute for the same reason
      System.out.println("This is another unreachable block");
    }
  }

  // Method to provide a dynamic condition that evaluates to false
  private boolean getCondition() {
    return false;
  }
}