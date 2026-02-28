class CloneIdiom3 implements Cloneable {
  @Override
  public Object clone() {
    // Original code
    return new CloneIdiom3();

    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable loop iteration.");
    }
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}