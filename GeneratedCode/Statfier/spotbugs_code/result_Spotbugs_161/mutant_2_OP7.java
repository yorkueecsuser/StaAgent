import edu.umd.cs.findbugs.annotations.ExpectWarning;

class IfBooleanAssignment {
  @ExpectWarning("DLS")
  public void test1(boolean b) {
    if (b = true) {
      System.out.println("Hi");
    }
    // Inserting unreachable while loop
    boolean conditionWhile = false;
    while (conditionWhile) {
      System.out.println("This is an unreachable loop");
    }
  }

  @ExpectWarning("DLS")
  public void test2(int a, int b, int c, int d, boolean e) {
    if (e = false) {
      System.out.println("Hi");
    }
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("This is another unreachable loop");
    }
  }

  private boolean returnTrue() {
    return true;
  }

  @ExpectWarning("DLS")
  public void test3(boolean b) {
    if (b = returnTrue()) System.out.println("don't report, this is more likely to be intended");
    // Inserting unreachable while loop
    boolean conditionWhile = false;
    while (conditionWhile) {
      System.out.println("Yet another unreachable loop");
    }
  }

  @ExpectWarning("DLS")
  public void test4(boolean b) {
    while (b = true) {
      System.out.println("Wow");
    }
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("And yet another unreachable loop");
    }
  }

  @ExpectWarning("DLS")
  public void test5(boolean b, boolean c) {
    if (b = c) System.out.println("Let this go too");
    // Inserting unreachable while loop
    boolean conditionWhile = false;
    while (conditionWhile) {
      System.out.println("One last unreachable loop");
    }
  }

  private boolean getCondition() {
    return false;
  }
}