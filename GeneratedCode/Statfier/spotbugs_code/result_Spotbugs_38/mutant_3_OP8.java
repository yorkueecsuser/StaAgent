class ForceClassInitialization {
  public static void main(String args[]) {
    Class c = InitializeMe.class;
    // Mutant code with renaming
    Class x = InitializeMe.class;
  }
}