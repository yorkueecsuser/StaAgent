class Issue1764 {
  boolean func() {
    String s1 = "str1";
    final String s2 = "str2";
    
    // Introduced an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
    }
    
    return s1 == s2;
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false; // This ensures the condition is always false at runtime
  }
}