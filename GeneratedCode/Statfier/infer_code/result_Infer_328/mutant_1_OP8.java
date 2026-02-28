class FieldAccess {

  class Test {
    int a;
  }

  void iterate_upto_field_size_linear(Test test) {
    for (int ci = 0; ci < test.a; ++ci) {}
  }

  // Mutated code
  void iterate_upto_field_size_linear_mutant(Test test) {
    for (int x = 0; x < test.a; ++x) {}
  }
}