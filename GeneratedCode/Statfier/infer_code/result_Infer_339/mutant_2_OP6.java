class TrickyExamples {

  int x;

  // pulse summary only includes a single disjunct for everything upto the throw statement.
  void loop_impure_FN() {
    if (x > 10) {
      throw new IllegalArgumentException("x too big");
    }
    x = 0;
    for (int i = 0; i < 10; i++) {}

    // Mutant: Unreachable for loop
    boolean conditionFor = getUnreachableCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor is always false
    }
  }

  // Method to provide a dynamically determined false condition
  private boolean getUnreachableCondition() {
    return false;
  }
}