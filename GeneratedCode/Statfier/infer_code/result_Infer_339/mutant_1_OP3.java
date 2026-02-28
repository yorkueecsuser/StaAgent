class TrickyExamples {

  int x;

  // pulse summary only includes a single disjunct for everything upto the throw statement.
  void loop_impure_FN() {
    if (x > 10) {
      throw new IllegalArgumentException("x too big");
    }
    x = 0;
    for (int i = 0; i < 10; i++) {}

    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      x = -1;
    }
  }

  // Method to provide a dynamic condition that will never be true
  private boolean getCondition() {
    return false;
  }
}