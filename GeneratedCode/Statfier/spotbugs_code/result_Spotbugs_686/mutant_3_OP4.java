class CloneIdiom3 implements Cloneable {
  @Override
  public Object clone() {
    // Original code
    return new CloneIdiom3();

    // Inserted unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block");
    } else {
      // This block will also never execute because shouldRun is always false
      System.out.println("This is another unreachable block");
    }
  }

  // Method to provide a dynamically determined condition
  private boolean getCondition() {
    return false;
  }
}