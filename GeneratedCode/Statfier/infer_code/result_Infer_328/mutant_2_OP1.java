class FieldAccess {

  class Test {
    int a;
  }

  void iterate_upto_field_size_linear(Test test) {
    for (int ci = 0; ci < test.a; ++ci) {
      // Dead Store mutation
      String vjklmnop = "unusedVariable";
    }
  }
}