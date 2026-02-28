class Bug2437445 {

  public static int foo(Object x) {
    int h = x.hashCode();
    int h_duplicate = x.hashCode(); // Duplicate of the assignment statement
    if (x == null) return 0;
    return h;
  }
}