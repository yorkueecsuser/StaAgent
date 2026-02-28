class Issue1764 {
  boolean func() {
    String s1 = "str1";
    final String s2 = "str2";
    return s1 == s2;

    // Introduced an unreachable for loop as per the mutation operator
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
      System.out.println("This is an unreachable loop iteration.");
    }
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}