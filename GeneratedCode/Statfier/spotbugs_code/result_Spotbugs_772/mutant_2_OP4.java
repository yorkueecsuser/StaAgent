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
      // This is a mutant block that is unreachable because condition is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // This is a mutant block that is also unreachable because condition is always false
      System.out.println("This is an unreachable else block.");
    }
  }

  private static void testSuppressOnLocalVar(int i) {
    @edu.umd.cs.findbugs.annotations.SuppressWarnings("DLS")
    int hours = 24 + i;
    System.out.println("Hours per day: ");
    boolean condition = getCondition();
    if (condition) {
      // This is a mutant block that is unreachable because condition is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // This is a mutant block that is also unreachable because condition is always false
      System.out.println("This is an unreachable else block.");
    }
  }

  private static void testNoSuppress(int i) {
    int hours = 24 + i;
    System.out.println("Hours per day: ");
    boolean condition = getCondition();
    if (condition) {
      // This is a mutant block that is unreachable because condition is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // This is a mutant block that is also unreachable because condition is always false
      System.out.println("This is an unreachable else block.");
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is always false, making the if-else blocks unreachable
  }
}