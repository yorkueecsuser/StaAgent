class Bug2824160a implements Comparable<Object> {
  private final String str;

  public Bug2824160a(final String s) {
    str = s;
  }

  @Override
  public int compareTo(Object o) {
    // TODO Auto-generated method stub
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This is an unreachable if statement
      System.out.println("This will never be printed");
    }
    return 0;
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, making the if statement unreachable
  }

  public static int test(Bug2824160a b) {
    return b.compareTo("Hello");
  }
}