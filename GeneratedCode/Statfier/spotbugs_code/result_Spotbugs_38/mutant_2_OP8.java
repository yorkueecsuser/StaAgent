class ForceClassInitialization {
  public static void main(String args[]) {
    Class c = InitializeMe.class;
    // Mutant code
    Class x = InitializeMe.class;
  }
}