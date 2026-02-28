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
    int x = hours; // Mutant: Added line with renamed variable
    System.out.println("Hours per day: ");
  }

  private static void testSuppressOnLocalVar(int i) {
    @edu.umd.cs.findbugs.annotations.SuppressWarnings("DLS")
    int hours = 24 + i;
    int y = hours; // Mutant: Added line with renamed variable
    System.out.println("Hours per day: ");
  }

  private static void testNoSuppress(int i) {
    int hours = 24 + i;
    int z = hours; // Mutant: Added line with renamed variable
    System.out.println("Hours per day: ");
  }
}