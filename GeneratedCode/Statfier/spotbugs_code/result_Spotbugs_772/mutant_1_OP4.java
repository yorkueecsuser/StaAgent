class Bug1889049 {
  public static void main(String[] args) {
    int i = Integer.parseInt(args[0]);
    testSuppressOnMethod(i);
    testSuppressOnLocalVar(i);
    testNoSuppress(i);
  }

  @edu.umd.cs.findbugs.annotations.SuppressWarnings("DLS")
  private static void testSuppressOnMethod(int i) {
    int hours = i + 24;
    System.out.println("Hours per day: ");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is an unreachable if block.");
    } else {
      // Some unreachable code
      System.out.println("This is an unreachable else block.");
    }
  }

  private static void testSuppressOnLocalVar(int i) {
    @edu.umd.cs.findbugs.annotations.SuppressWarnings("DLS")
    int hours = 24 + i;
    System.out.println("Hours per day: ");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is an unreachable if block.");
    } else {
      // Some unreachable code
      System.out.println("This is an unreachable else block.");
    }
  }

  private static void testNoSuppress(int i) {
    int hours = 24 + i;
    System.out.println("Hours per day: ");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is an unreachable if block.");
    } else {
      // Some unreachable code
      System.out.println("This is an unreachable else block.");
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}