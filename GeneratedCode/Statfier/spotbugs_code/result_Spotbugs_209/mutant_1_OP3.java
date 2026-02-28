/** Class to check the issue 1254. */
class Issue1254 {

  private int outerField = 0;

  private static void println(String string) {
    System.out.println(string);
  }

  public void outerMethod() {
    new Runnable() {
      @Override
      public void run() {
        ++outerField;
        Inner inner = new Inner();
        ++inner.innerField;
        inner.innerMethod();
        println("Anonymous class called, outerField=" + outerField);

        // Introduced unreachable if statement
        boolean condition = getCondition();
        if (condition) {
          println("This is an unreachable statement in outerMethod.");
        }
      }
    }.run();
  }

  private void uncalledOuterMethod() {
    println("uncalledOuterMethod() should produce a warning during analysis");

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      println("This is an unreachable statement in uncalledOuterMethod.");
    }
  }

  private static class Inner {
    private int innerField = 0;

    private void innerMethod() {
      println("Inner.innerMethod() called, innerField=" + innerField);

      // Introduced unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        println("This is an unreachable statement in innerMethod.");
      }
    }

    private void uncalledInnerMethod() {
      println("uncalledInnerMethod() should produce a warning during analysis");

      // Introduced unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        println("This is an unreachable statement in uncalledInnerMethod.");
      }
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}