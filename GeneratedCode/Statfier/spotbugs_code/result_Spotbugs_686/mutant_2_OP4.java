class CloneIdiom3 implements Cloneable {
  @Override
  public Object clone() {
    // Original code
    return new CloneIdiom3();

    // Mutated code - Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block");
    } else {
      // Alternative block also unreachable due to the same reason
      System.out.println("This is another unreachable block");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}