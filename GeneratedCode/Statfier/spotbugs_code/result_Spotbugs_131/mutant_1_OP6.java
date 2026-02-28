abstract class Eq {
  public abstract boolean equals(Eq q);

  // Inserting an unreachable for loop
  public void someMethod() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is intended to be unreachable
      System.out.println("This loop should never execute");
    }
  }

  private boolean getCondition() {
    return false; // This ensures the condition is always false at runtime
  }
}