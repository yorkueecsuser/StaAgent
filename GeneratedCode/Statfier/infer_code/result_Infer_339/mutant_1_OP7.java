class TrickyExamples {

  int x;

  // pulse summary only includes a single disjunct for everything upto the throw statement.
  void loop_impure_FN() {
    if (x > 10) {
      throw new IllegalArgumentException("x too big");
    }
    x = 0;
    for (int i = 0; i < 10; i++) {}

    // Unreachable while loop mutant
    boolean conditionWhile = getUnreachableCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}