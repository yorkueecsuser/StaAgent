class Bug2824160a implements Comparable<Object> {
  private final String str;

  public Bug2824160a(final String s) {
    str = s;
  }

  @Override
  public int compareTo(Object o) {
    // TODO Auto-generated method stub
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return 0;
  }

  public static int test(Bug2824160a b) {
    return b.compareTo("Hello");
  }

  private boolean getCondition() {
    return false;
  }
}