class Bug2437445 {

  public static int foo(Object x) {
    int h = x.hashCode();
    int h_duplicate = h; // Duplicate assignment
    if (x == null) return 0;
    return h;
  }
}