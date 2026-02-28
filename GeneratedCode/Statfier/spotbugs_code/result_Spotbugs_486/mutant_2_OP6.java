class ForgotToOverrideEquals {

  int x, y;

  public ForgotToOverrideEquals(int x, int y) {
    this.x = x;
    this.y = y;
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  private boolean getCondition() {
    return false;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + x;
    result = prime * result + y;
    return result;
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
      // Inserting an unreachable for loop
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because conditionFor will always be false
      }
    }

    private boolean getCondition() {
      return false;
    }
  }
}