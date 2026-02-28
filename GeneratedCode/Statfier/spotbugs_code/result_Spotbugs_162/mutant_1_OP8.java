class OverwrittenParameter {

  public void f(int i, String x, String y, String z) {
    y = Integer.toString(i);
  }

  // Mutant 1: Renaming 'x' to 'a'
  public void f_mutant1(int i, String a, String y, String z) {
    y = Integer.toString(i);
  }

  public void g(long i, String x, String y, String z) {
    y = Long.toString(i);
  }

  // Mutant 2: Renaming 'z' to 'b'
  public void g_mutant2(long i, String x, String y, String b) {
    y = Long.toString(i);
  }
}