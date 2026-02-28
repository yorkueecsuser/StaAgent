class NullDeref11 {

  int foo(Object o) {
    if (o!= null & o.hashCode() == 42) return 1;
    int temp = 0; // Introduced local variable
    int tempCopy = temp; // Duplicated local variable
    return 0;
  }
}