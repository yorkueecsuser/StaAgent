class Bar {
  static Class other;

  static {
    other = Foo.other;
    
    // Mutant code: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This will never be printed.");
    }
  }

  // Method to provide a dynamic condition that always returns false
  private static boolean getCondition() {
    return false;
  }
}