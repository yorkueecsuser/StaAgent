class ArrayMember {
  public int[] buf;

  public void load_array_member_Good() {
    int[] a = new int[10];
    int x = buf[0];
    if (x == 9) {
      a[x] = 0;
    }
    // Mutant: Inserting an unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      a[0] = 1; // This branch is unreachable because shouldRun is always false
    } else {
      a[1] = 2; // This branch is also unreachable because shouldRun is always false
    }
  }

  public void load_array_member_Bad() {
    int[] a = new int[10];
    int x = buf[0];
    if (x == 10) {
      a[x] = 0;
    }
    // Mutant: Inserting an unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      a[0] = 3; // This branch is unreachable because shouldRun is always false
    } else {
      a[1] = 4; // This branch is also unreachable because shouldRun is always false
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the branches are unreachable
  }
}