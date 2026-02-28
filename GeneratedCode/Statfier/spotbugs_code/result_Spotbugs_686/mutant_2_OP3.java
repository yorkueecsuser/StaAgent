class CloneIdiom3 implements Cloneable {
  @Override
  public Object clone() {
    // Introducing an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This will never be printed");
    }
    
    return new CloneIdiom3();
  }

  private boolean getCondition() {
    // Always returns false to ensure the if block is unreachable
    return false;
  }
}