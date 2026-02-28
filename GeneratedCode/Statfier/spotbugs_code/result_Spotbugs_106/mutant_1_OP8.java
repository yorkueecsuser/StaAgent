class NullDeref11 {

  int foo(Object o) {
    if (o!= null & o.hashCode() == 42) return 1;
    return 0;
  }

  int bar(Object x) {
    if (x!= null & x.hashCode() == 42) return 1;
    return 0;
  }
}