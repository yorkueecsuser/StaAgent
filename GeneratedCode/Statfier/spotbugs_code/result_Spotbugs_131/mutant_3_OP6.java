abstract class Eq {
  public abstract boolean equals(Eq q);

  // Inserting an unreachable for loop according to the mutation operator
  public void someMethod() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is intended to be unreachable
      System.out.println("This loop should never execute");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}