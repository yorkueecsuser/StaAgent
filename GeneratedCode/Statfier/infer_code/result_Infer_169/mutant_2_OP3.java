class ArrayMember {
  public int[] buf;

  public void load_array_member_Good() {
    int[] a = new int[10];
    int x = buf[0];
    if (x == 9) {
      a[x] = 0;
    }
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      a[0] = 1; // This line is unreachable
    }
  }

  public void load_array_member_Bad() {
    int[] a = new int[10];
    int x = buf[0];
    if (x == 10) {
      a[x] = 0;
    }
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      a[1] = 2; // This line is unreachable
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false at runtime
  }
}