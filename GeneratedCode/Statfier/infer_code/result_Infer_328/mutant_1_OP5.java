class FieldAccess {

  class Test {
    int a;
  }

  void iterate_upto_field_size_linear(Test test) {
    for (int ci = 0; ci < test.a; ++ci) {
      // Inserting unreachable switch statement
      boolean alwaysFalse = getAlwaysFalse();
      switch (alwaysFalse? 1 : 0) {
        case 1:
          // This case is unreachable because alwaysFalse is always false
          System.out.println("This is an unreachable statement");
          break;
      }
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}