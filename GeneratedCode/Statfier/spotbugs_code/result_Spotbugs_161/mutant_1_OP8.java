import edu.umd.cs.findbugs.annotations.ExpectWarning;

class IfBooleanAssignment {
  @ExpectWarning("DLS")
  public void test1(boolean b) {
    if (b = true) {
      System.out.println("Hi");
    }
  }

  @ExpectWarning("DLS")
  public void test2(int a, int x, int c, int d, boolean e) {
    if (e = false) {
      System.out.println("Hi");
    }
  }

  private boolean returnTrue() {
    return true;
  }

  @ExpectWarning("DLS")
  public void test3(boolean z) {
    if (z = returnTrue()) System.out.println("don't report, this is more likely to be intended");
  }

  @ExpectWarning("DLS")
  public void test4(boolean y) {
    while (y = true) {
      System.out.println("Wow");
    }
  }

  @ExpectWarning("DLS")
  public void test5(boolean v, boolean w) {
    if (v = w) System.out.println("Let this go too");
  }
}