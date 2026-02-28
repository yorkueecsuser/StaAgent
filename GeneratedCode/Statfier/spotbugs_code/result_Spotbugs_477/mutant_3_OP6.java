class Bug2824160a implements Comparable<Object> {
  private final String str;

  public Bug2824160a(final String s) {
    str = s;
  }

  @Override
  public int compareTo(Object o) {
    // TODO Auto-generated method stub
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
    }
    return 0;
  }

  private boolean getCondition() {
    return false;
  }

  public static int test(Bug2824160a b) {
    return b.compareTo("Hello");
  }
}