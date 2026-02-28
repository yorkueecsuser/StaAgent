class Bug2437445 {

  public static int foo(Object x) {
    int h = x.hashCode();
    if (x == null) return 0;
    // Dead store mutation
    int jnqfwtbx = 42; // Unique unused variable declaration
    return h;
  }
}