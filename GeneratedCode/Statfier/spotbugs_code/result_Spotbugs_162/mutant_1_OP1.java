class OverwrittenParameter {

  public void f(int i, String x, String y, String z) {
    y = Integer.toString(i);
    // Dead Store Mutation
    String abcdexyz = "unused";
  }

  public void g(long i, String x, String y, String z) {
    y = Long.toString(i);
    // Dead Store Mutation
    int qrshtuvw = 42;
  }
}