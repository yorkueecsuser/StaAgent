class ArrayMember {
  public int[] buf;

  public void load_array_member_Good() {
    int[] a = new int[10];
    int x = buf[0];
    if (x == 9) {
      a[x] = 0;
    }
    // Introduced unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse? 0 : 1) {
      case 0:
        // This case is unreachable because alwaysFalse is set to false by getCondition()
        a[0] = 1;
        break;
      case 1:
        // This case is always executed
        break;
    }
  }

  public void load_array_member_Bad() {
    int[] a = new int[10];
    int x = buf[0];
    if (x == 10) {
      a[x] = 0;
    }
    // Introduced unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse? 0 : 1) {
      case 0:
        // This case is unreachable because alwaysFalse is set to false by getCondition()
        a[0] = 1;
        break;
      case 1:
        // This case is always executed
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}