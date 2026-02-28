class NullDeref11 {

  int foo(Object o) {
    if (o!= null & o.hashCode() == 42) {
      return 1; // Original return statement
      return 1; // Duplicated return statement
    }
    return 0; // Original return statement
    return 0; // Duplicated return statement
  }
}