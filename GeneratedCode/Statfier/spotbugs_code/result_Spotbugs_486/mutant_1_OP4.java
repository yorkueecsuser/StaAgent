class ForgotToOverrideEquals {

  int x, y;

  public ForgotToOverrideEquals(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + x;
    result = prime * result + y;
    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because getCondition() always returns false
      result = 0;
    } else {
      // This block will always be executed
      result = result * 2;
    }
    return result;
  }

  private boolean getCondition() {
    // Always returns false to ensure the if block is unreachable
    return false;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ForgotToOverrideEquals)) return false;
    final ForgotToOverrideEquals other = (ForgotToOverrideEquals) obj;
    if (x!= other.x) return false;
    if (y!= other.y) return false;
    return true;
  }

  static class Oops extends ForgotToOverrideEquals {
    int z;

    public Oops(int x, int y, int z) {
      super(x, y);
      this.z = z;
    }
  }
}