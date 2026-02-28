class ExclusiveTest {

  void linear(int x) {
    for (int i = 0; i < x; i++) {}

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
  }

  void call_linear_exclusive_constant(int x) {
    linear(x);

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
  }

  void call_linear_exclusive_linear(int x) {
    for (int i = 0; i < x; i++) {
      linear(i);
    }

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}