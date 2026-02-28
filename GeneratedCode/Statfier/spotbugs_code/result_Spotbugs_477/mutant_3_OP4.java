class Bug2824160a implements Comparable<Object> {
  private final String str;

  public Bug2824160a(final String s) {
    str = s;
  }

  @Override
  public int compareTo(Object o) {
    // TODO Auto-generated method stub
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if block.");
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block.");
    }
    return 0;
  }

  public static int test(Bug2824160a b) {
    return b.compareTo("Hello");
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime and is always false
    return false;
  }
}