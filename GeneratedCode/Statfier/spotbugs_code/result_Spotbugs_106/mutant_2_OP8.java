class NullDeref11 {

  int foo(Object o) {
    if (o!= null & o.hashCode() == 42) return 1;
    return 0;
  }

  int bar(Object a) {
    if (a!= null & a.hashCode() == 42) return 1;
    return 0;
  }
}