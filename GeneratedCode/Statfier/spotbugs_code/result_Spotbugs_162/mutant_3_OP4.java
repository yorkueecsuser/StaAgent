class OverwrittenParameter {

  public void f(int i, String x, String y, String z) {
    y = Integer.toString(i);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This is a reachable block in f method.");
    } else {
      // This is an unreachable block due to the condition always being false
      System.out.println("This is an unreachable block in f method.");
    }
  }

  public void g(long i, String x, String y, String z) {
    y = Long.toString(i);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This is a reachable block in g method.");
    } else {
      // This is an unreachable block due to the condition always being false
      System.out.println("This is an unreachable block in g method.");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}