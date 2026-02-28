class FieldAccess {

  class Test {
    int a;
  }

  void iterate_upto_field_size_linear(Test test) {
    for (int ci = 0; ci < test.a; ++ci) {
      // Original assignment statement
      ci = ci + 1;
      // Duplicated assignment statement
      ci = ci + 1;
    }
  }
}