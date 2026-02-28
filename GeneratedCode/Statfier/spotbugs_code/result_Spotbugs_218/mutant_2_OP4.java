class Issue1764 {
  boolean func() {
    String s1 = "str1";
    final String s2 = "str2";
    return s1 == s2;

    // Mutant code start
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      System.out.println("This is an unreachable if block.");
    } else {
      // This block is also intended to be unreachable
      System.out.println("This is an unreachable else block.");
    }
    // Mutant code end
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will ensure the if-else block remains unreachable
  }
}