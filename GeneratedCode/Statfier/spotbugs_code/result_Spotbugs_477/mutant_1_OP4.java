class Bug2824160a implements Comparable<Object> {
  private final String str;

  public Bug2824160a(final String s) {
    str = s;
  }

  @Override
  public int compareTo(Object o) {
    // TODO Auto-generated method stub
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code");
    }
    return 0;
  }

  private boolean getCondition() {
    // This method always returns false, making the if-else branches unreachable
    return false;
  }

  public static int test(Bug2824160a b) {
    return b.compareTo("Hello");
  }
}