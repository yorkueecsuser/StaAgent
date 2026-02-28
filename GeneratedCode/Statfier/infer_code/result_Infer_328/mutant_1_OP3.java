class FieldAccess {

  class Test {
    int a;
  }

  void iterate_upto_field_size_linear(Test test) {
    for (int ci = 0; ci < test.a; ++ci) {
      // Inserting an unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() will always return false
        System.out.println("This is an unreachable statement");
      }
    }
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}