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
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    return 0;
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if statement is unreachable
  }

  public static int test(Bug2824160a b) {
    return b.compareTo("Hello");
  }
}