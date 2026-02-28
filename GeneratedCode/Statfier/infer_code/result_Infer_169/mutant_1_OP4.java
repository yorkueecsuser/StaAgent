class ArrayMember {
  public int[] buf;

  public void load_array_member_Good() {
    int[] a = new int[10];
    int x = buf[0];
    if (x == 9) {
      a[x] = 0;
    }
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      a[0] = 1; // This branch is intended to be unreachable
    } else {
      a[1] = 2; // This branch is also intended to be unreachable
    }
  }

  public void load_array_member_Bad() {
    int[] a = new int[10];
    int x = buf[0];
    if (x == 10) {
      a[x] = 0;
    }
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      a[0] = 3; // This branch is intended to be unreachable
    } else {
      a[1] = 4; // This branch is also intended to be unreachable
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the branches unreachable
  }
}