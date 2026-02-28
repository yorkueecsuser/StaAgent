class ForceClassInitialization {
  public static void main(String args[]) {
    Class c = InitializeMe.class;
    // Mutated code
    Class x = InitializeMe.class;
  }
}