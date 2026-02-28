class ArrayMember {
  public int[] buf;

  public void load_array_member_Good() {
    int[] a = new int[10];
    int x = buf[0];
    if (x == 9) {
      a[x] = 0;
    }
    // Unreachable for loop mutation
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  public void load_array_member_Bad() {
    int[] a = new int[10];
    int x = buf[0];
    if (x == 10) {
      a[x] = 0;
    }
    // Unreachable for loop mutation
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  private boolean getCondition() {
    return false;
  }
}