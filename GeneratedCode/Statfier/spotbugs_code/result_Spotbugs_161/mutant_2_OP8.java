import edu.umd.cs.findbugs.annotations.ExpectWarning;

class IfBooleanAssignment {
  @ExpectWarning("DLS")
  public void test1(boolean b) {
    if (b = true) {
      System.out.println("Hi");
    }
  }

  // Mutant for test1
  @ExpectWarning("DLS")
  public void test1a(boolean x) {
    if (x = true) {
      System.out.println("Hi");
    }
  }

  @ExpectWarning("DLS")
  public void test2(int a, int b, int c, int d, boolean e) {
    if (e = false) {
      System.out.println("Hi");
    }
  }

  // Mutant for test2
  @ExpectWarning("DLS")
  public void test2a(int f, int g, int h, int i, boolean j) {
    if (j = false) {
      System.out.println("Hi");
    }
  }

  private boolean returnTrue() {
    return true;
  }

  @ExpectWarning("DLS")
  public void test3(boolean b) {
    if (b = returnTrue()) System.out.println("don't report, this is more likely to be intended");
  }

  // Mutant for test3
  @ExpectWarning("DLS")
  public void test3a(boolean k) {
    if (k = returnTrue()) System.out.println("don't report, this is more likely to be intended");
  }

  @ExpectWarning("DLS")
  public void test4(boolean b) {
    while (b = true) {
      System.out.println("Wow");
    }
  }

  // Mutant for test4
  @ExpectWarning("DLS")
  public void test4a(boolean l) {
    while (l = true) {
      System.out.println("Wow");
    }
  }

  @ExpectWarning("DLS")
  public void test5(boolean b, boolean c) {
    if (b = c) System.out.println("Let this go too");
  }

  // Mutant for test5
  @ExpectWarning("DLS")
  public void test5a(boolean m, boolean n) {
    if (m = n) System.out.println("Let this go too");
  }
}