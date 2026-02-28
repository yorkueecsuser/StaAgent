class FieldAccess {

  class Test {
    int a;
  }

  void iterate_upto_field_size_linear(Test test) {
    int ci = 0;
    do {
      if (ci >= test.a) break;
      ++ci;
    } while (true);
  }
}