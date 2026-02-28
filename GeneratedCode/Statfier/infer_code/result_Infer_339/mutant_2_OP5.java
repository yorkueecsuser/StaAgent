class TrickyExamples {

  int x;

  // pulse summary only includes a single disjunct for everything upto the throw statement.
  void loop_impure_FN() {
    if (x > 10) {
      throw new IllegalArgumentException("x too big");
    }
    x = 0;
    for (int i = 0; i < 10; i++) {}

    // Introduced unreachable switch statement
    boolean condition = getUnreachableCondition();
    switch (condition? 1 : 0) {
      case 1:
        // This case will never be executed
        x = 99;
        break;
      default:
        // Default case will also never be executed due to the condition
        x = 88;
        break;
    }
  }

  // Method to provide a dynamically determined condition that will always be false
  private boolean getUnreachableCondition() {
    return false;
  }
}