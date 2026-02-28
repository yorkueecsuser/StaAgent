class OverwrittenParameter {

  public void f(int i, String x, String y, String z) {
    y = Integer.toString(i);
  }

  // Mutated method with renamed variables
  public void f(int a, String b, String c, String d) {
    c = Integer.toString(a);
  }

  public void g(long i, String x, String y, String z) {
    y = Long.toString(i);
  }

  // Mutated method with renamed variables
  public void g(long a, String b, String c, String d) {
    c = Long.toString(a);
  }
}