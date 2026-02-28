class ArrayMember {
  public int[] buf;

  public void load_array_member_Good() {
    int[] a = new int[10];
    int x = buf[0];
    if (x == 9) {
      a[x] = 0;
    }
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      a[0] = 1; // This branch is unreachable because getCondition() will never return true
    } else {
      a[1] = 2; // This branch is also unreachable for the same reason
    }
  }

  public void load_array_member_Bad() {
    int[] a = new int[10];
    int x = buf[0];
    if (x == 10) {
      a[x] = 0;
    }
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      a[0] = 1; // This branch is unreachable because getCondition() will never return true
    } else {
      a[1] = 2; // This branch is also unreachable for the same reason
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}