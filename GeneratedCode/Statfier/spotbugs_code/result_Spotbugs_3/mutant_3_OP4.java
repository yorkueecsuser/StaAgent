class Bug1926389 {
  public int avg(int i, int j, int[] elts) {
    int k = (i + j) / 2;
    System.out.println(k);

    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block");
      k = -1; // Some arbitrary operation
    } else {
      // This block will always execute
      System.out.println("This is the reachable block");
    }

    return elts[k];
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}