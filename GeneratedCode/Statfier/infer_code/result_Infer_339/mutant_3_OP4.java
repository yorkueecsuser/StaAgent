class TrickyExamples {

  int x;

  // pulse summary only includes a single disjunct for everything upto the throw statement.
  void loop_impure_FN() {
    if (x > 10) {
      throw new IllegalArgumentException("x too big");
    }
    x = 0;
    for (int i = 0; i < 10; i++) {}

    // Mutated code: Inserting an unreachable if-else branch
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is unreachable because getUnreachableCondition() always returns false
      x = 100;
    } else {
      // This block is also unreachable for the same reason
      x = 200;
    }
  }

  // Method to provide a dynamic but always false condition
  private boolean getUnreachableCondition() {
    return false;
  }
}