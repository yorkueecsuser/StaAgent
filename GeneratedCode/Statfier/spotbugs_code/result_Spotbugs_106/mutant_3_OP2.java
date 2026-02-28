class NullDeref11 {

  int foo(Object o) {
    boolean condition = o!= null & o.hashCode() == 42;
    boolean conditionCopy = o!= null & o.hashCode() == 42; // Duplicated condition
    if (condition) return 1;
    return 0;
  }
}