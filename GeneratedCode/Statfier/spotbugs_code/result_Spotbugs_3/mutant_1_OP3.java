class Bug1926389 {
  public int avg(int i, int j, int[] elts) {
    int k = (i + j) / 2;
    System.out.println(k);

    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable block");
      k = -1; // Some arbitrary operation
    }

    return elts[k];
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}