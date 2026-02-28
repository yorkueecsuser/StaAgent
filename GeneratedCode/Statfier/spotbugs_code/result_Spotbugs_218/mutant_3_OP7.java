class Issue1764 {
  boolean func() {
    String s1 = "str1";
    final String s2 = "str2";
    
    // Introduced an unreachable while loop with a dynamic condition
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
    }
    
    return s1 == s2;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}