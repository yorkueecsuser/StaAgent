class StringBuilderTest {

  StringBuilder mId;

  void new_linear(String s) {
    String str = new StringBuilder(s).toString();
    for (int i = 0; i < str.length(); i++) {}
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("Reachable block");
    } else {
      // This block is unreachable
      System.out.println("Unreachable block");
    }
  }

  void new_constant() {
    String s = new StringBuilder("hello").toString();
    new_linear(s);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("Reachable block in new_constant");
    } else {
      // This block is unreachable
      System.out.println("Unreachable block in new_constant");
    }
  }

  void new_capacity_constant() {
    String s =
        new StringBuilder(10).toString(); // capacity is irrelevant to underlying size of the string
    new_linear(s);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("Reachable block in new_capacity_constant");
    } else {
      // This block is unreachable
      System.out.println("Unreachable block in new_capacity_constant");
    }
  }

  void append_linear(String s) {
    String str = new StringBuilder(s).append("me").toString();
    new_linear(str);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("Reachable block in append_linear");
    } else {
      // This block is unreachable
      System.out.println("Unreachable block in append_linear");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}