import edu.umd.cs.findbugs.annotations.ExpectWarning;

class IfBooleanAssignment {
  @ExpectWarning("DLS")
  public void test1(boolean b) {
    if (b = true) {
      System.out.println("Hi");
    }
  }

  @ExpectWarning("DLS")
  public void test2(int a, int b, int c, int d, boolean e) {
    if (e = false) {
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

  @ExpectWarning("DLS")
  public void test4(boolean b) {
    while (b = true) {
      System.out.println("Wow");
    }
  }

  @ExpectWarning("DLS")
  public void test5(boolean b, boolean c) {
    if (b = c) System.out.println("Let this go too");
  }

  // Mutated code starts here

  @ExpectWarning("DLS")
  public void test1Mutant(boolean x) {
    if (x = true) {
      System.out.println("Hi");
    }
  }

  @ExpectWarning("DLS")
  public void test2Mutant(int f, int g, int h, int i, boolean j) {
    if (j = false) {
      System.out.println("Hi");
    }
  }

  private boolean returnTrueMutant() {
    return true;
  }

  @ExpectWarning("DLS")
  public void test4Mutant(boolean k) {
    while (k = true) {
      System.out.println("Wow");
    }
  }

  @ExpectWarning("DLS")
  public void test5Mutant(boolean l, boolean m) {
    if (l = m) System.out.println("Let this go too");
  }
}