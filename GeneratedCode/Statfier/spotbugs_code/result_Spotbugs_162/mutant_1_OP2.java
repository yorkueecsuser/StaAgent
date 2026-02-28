class OverwrittenParameter {

  public void f(int i, String x, String y, String z) {
    y = Integer.toString(i);
    y = Integer.toString(i); // Duplicate assignment
  }

  public void g(long i, String x, String y, String z) {
    y = Long.toString(i);
    y = Long.toString(i); // Duplicate assignment
  }
}