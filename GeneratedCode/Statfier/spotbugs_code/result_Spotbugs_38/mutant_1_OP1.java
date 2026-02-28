class ForceClassInitialization {
  public static void main(String args[]) {
    Class c = InitializeMe.class;
    String abcdabcd = "unusedVariable"; // Dead Store mutation
  }
}