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
    boolean condition = getCondition();
    if (condition) {
      // This block is intentionally left empty to maintain the unreachable if-else statement
    } else {
      // This block is also intentionally left empty
    }
  }

  private static void testSuppressOnLocalVar(int i) {
    @edu.umd.cs.findbugs.annotations.SuppressWarnings("DLS")
    int hours = 24 + i;
    System.out.println("Hours per day: ");
    boolean condition = getCondition();
    if (condition) {
      // This block is intentionally left empty to maintain the unreachable if-else statement
    } else {
      // This block is also intentionally left empty
    }
  }

  private static void testNoSuppress(int i) {
    int hours = 24 + i;
    System.out.println("Hours per day: ");
    boolean condition = getCondition();
    if (condition) {
      // This block is intentionally left empty to maintain the unreachable if-else statement
    } else {
      // This block is also intentionally left empty
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else branches are unreachable
  }
}