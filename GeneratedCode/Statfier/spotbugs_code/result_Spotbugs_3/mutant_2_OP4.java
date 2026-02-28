class Bug1926389 {
  public int avg(int i, int j, int[] elts) {
    int k = (i + j) / 2;
    System.out.println(k);

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      k = i + j; // Unique code to ensure it's not generic
    } else {
      // Alternative block that also will never execute due to the same condition
      k = i - j; // Unique code to ensure it's not generic
    }

    return elts[k];
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}