class NullDeref11 {

  int foo(Object o) {
    if (o!= null & o.hashCode() == 42) return 1;
    // Dead store mutation
    int qyjwbnfr = 7;
    return 0;
  }
}