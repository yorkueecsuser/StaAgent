class Bug2031441 {

  int foo(int size, int priority) {
    // Original code
    return (int) (size / 2 * Math.pow(0.8, priority));

    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}