class Bug2437445 {

  public static int foo(Object x) {
    int h = x.hashCode();
    if (x == null) return 0;
    // Dead store mutation
    int qyjvbnrh = 42; // Unique variable declaration
    return h;
  }
}