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
          println("This should never be printed");
        } else {
          println("This should also never be printed");
        }
      }
    }.run();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }

  private void uncalledOuterMethod() {
    println("uncalledOuterMethod() should produce a warning during analysis");
  }

  private static class Inner {
    private int innerField = 0;

    private void innerMethod() {
      println("Inner.innerMethod() called, innerField=" + innerField);

      // Introduced unreachable if-else statement
      boolean shouldRunInner = getInnerCondition();
      if (shouldRunInner) {
        println("This should never be printed in inner method");
      } else {
        println("This should also never be printed in inner method");
      }
    }

    private boolean getInnerCondition() {
      return false; // This method ensures the condition is dynamically determined but always false
    }

    private void uncalledInnerMethod() {
      println("uncalledInnerMethod() should produce a warning during analysis");
    }
  }
}