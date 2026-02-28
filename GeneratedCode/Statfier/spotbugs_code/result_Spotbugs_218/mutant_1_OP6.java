class Issue1764 {
  boolean func() {
    String s1 = "str1";
    final String s2 = "str2";
    return s1 == s2;

    // Introduced an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will never be true at runtime
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the loop is unreachable
  }
}