class NullDeref11 {

  int foo(Object o) {
    if (o!= null & o.hashCode() == 42) return 1;
    String qwerasdf = "unused"; // Dead store
    return 0;
  }
}