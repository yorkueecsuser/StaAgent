class Bug2824160a implements Comparable<Object> {
  private final String str;

  public Bug2824160a(final String s) {
    str = s;
  }

  @Override
  public int compareTo(Object o) {
    // TODO Auto-generated method stub
    return 0;
  }

  public static int test(Bug2824160a b) {
    return b.compareTo("Hello");
  }

  // Inserting an unreachable switch statement
  public void unreachableSwitch() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never be printed");
        break;
      case 1:
        // This is the only reachable case
        System.out.println("This will always be printed");
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}