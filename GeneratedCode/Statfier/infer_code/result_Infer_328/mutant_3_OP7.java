class FieldAccess {

  class Test {
    int a;
  }

  void iterate_upto_field_size_linear(Test test) {
    for (int ci = 0; ci < test.a; ++ci) {}

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile will always be false at runtime
    }
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}