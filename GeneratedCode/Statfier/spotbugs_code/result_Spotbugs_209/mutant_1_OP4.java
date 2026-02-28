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

        // Introduced unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
          println("This will never be printed because shouldRun is always false.");
        } else {
          println("This will also never be printed because shouldRun is always false.");
        }
      }
    }.run();
  }

  private void uncalledOuterMethod() {
    println("uncalledOuterMethod() should produce a warning during analysis");
  }

  private static class Inner {
    private int innerField = 0;

    private void innerMethod() {
      println("Inner.innerMethod() called, innerField=" + innerField);

      // Introduced unreachable if-else statement
      boolean shouldRunInner = getCondition();
      if (shouldRunInner) {
        println("This will never be printed because shouldRunInner is always false.");
      } else {
        println("This will also never be printed because shouldRunInner is always false.");
      }
    }

    private void uncalledInnerMethod() {
      println("uncalledInnerMethod() should produce a warning during analysis");
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}