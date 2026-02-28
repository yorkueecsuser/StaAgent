abstract class Eq {
  public abstract boolean equals(Eq q);

  // Inserting an unreachable for loop as per the mutation operator description
  public void someMethod() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is intended to be unreachable
      System.out.println("This is an unreachable loop");
    }
  }

  private boolean getCondition() {
    // This method returns false, making the loop condition always false
    return false;
  }
}