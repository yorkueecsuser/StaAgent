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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined to be false
    }
  }

  // Method to provide a dynamic condition that will be false
  private boolean getCondition() {
    return false;
  }
}