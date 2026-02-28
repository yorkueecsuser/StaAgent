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
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because getCondition() always returns false
    }
  }

  private static void testSuppressOnLocalVar(int i) {
    @edu.umd.cs.findbugs.annotations.SuppressWarnings("DLS")
    int hours = 24 + i;
    System.out.println("Hours per day: ");
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because getCondition() always returns false
    }
  }

  private static void testNoSuppress(int i) {
    int hours = 24 + i;
    System.out.println("Hours per day: ");
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because getCondition() always returns false
    }
  }

  private static boolean getCondition() {
    return false;
  }
}