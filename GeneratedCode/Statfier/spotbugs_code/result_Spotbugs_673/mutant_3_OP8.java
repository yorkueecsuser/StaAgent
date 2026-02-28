class Bug2437445 {

  public static int foo(Object x) {
    int h = x.hashCode();
    int a = h; // Mutant variable introduced
    if (x == null) return 0;
    return a; // Using mutant variable
  }
}