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

        // Introduced unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // This loop is unreachable because conditionFor is dynamically determined and set to false
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
    }

    private void uncalledInnerMethod() {
      println("uncalledInnerMethod() should produce a warning during analysis");
    }
  }

  // Method to provide a dynamic condition that evaluates to false
  private boolean getCondition() {
    return false;
  }
}