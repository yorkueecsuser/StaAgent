class OverwrittenParameter {

  public void f(int i, String x, String y, String z) {
    y = Integer.toString(i);
  }

  // Mutated method f with renaming
  public void f(int a, String b, String c, String d) {
    c = Integer.toString(a);
  }

  public void g(long i, String x, String y, String z) {
    y = Long.toString(i);
  }

  // Mutated method g with renaming
  public void g(long a, String b, String c, String d) {
    c = Long.toString(a);
  }
}