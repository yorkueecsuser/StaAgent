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
    // Mutant: Renaming 'hours' to 'a'
    int a = i + 24;
    System.out.println("Mutant Hours per day: " + a);
  }

  private static void testSuppressOnLocalVar(int i) {
    @edu.umd.cs.findbugs.annotations.SuppressWarnings("DLS")
    int hours = 24 + i;
    System.out.println("Hours per day: ");
    // Mutant: Renaming 'hours' to 'b'
    int b = 24 + i;
    System.out.println("Mutant Hours per day: " + b);
  }

  private static void testNoSuppress(int i) {
    int hours = 24 + i;
    System.out.println("Hours per day: ");
    // Mutant: Renaming 'hours' to 'c'
    int c = 24 + i;
    System.out.println("Mutant Hours per day: " + c);
  }
}