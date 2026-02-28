class Issue1764 {
  boolean func() {
    String s1 = "str1";
    final String s2 = "str2";
    return s1 == s2;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case.");
        break;
      default:
        // This default case is also unreachable for the same reason
        System.out.println("This is another unreachable case.");
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}