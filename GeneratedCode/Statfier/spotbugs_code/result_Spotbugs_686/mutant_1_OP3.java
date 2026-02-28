class CloneIdiom3 implements Cloneable {
  @Override
  public Object clone() {
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable statement.");
    }
    
    return new CloneIdiom3();
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}