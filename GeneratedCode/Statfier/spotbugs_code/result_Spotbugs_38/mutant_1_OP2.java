class ForceClassInitialization {
  public static void main(String args[]) {
    Class c = InitializeMe.class;
    Class cDuplicate = InitializeMe.class; // Duplicate assignment statement
  }
}