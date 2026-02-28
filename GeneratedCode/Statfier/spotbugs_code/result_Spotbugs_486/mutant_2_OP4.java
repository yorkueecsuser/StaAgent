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
    // Introduced an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      result = result + 100; // This will never be executed
    } else {
      result = result + 200; // This will also never be executed
    }
    return result;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
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
      // Introduced an unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        this.z += 10; // This will never be executed
      } else {
        this.z += 20; // This will also never be executed
      }
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined but always false
    }
  }
}