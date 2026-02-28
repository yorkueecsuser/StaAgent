class ForgotToOverrideEquals {

  int x, y;

  public ForgotToOverrideEquals(int x, int y) {
    this.x = x;
    this.x = x; // Duplicate assignment
    this.y = y;
    this.y = y; // Duplicate assignment
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + x;
    result = prime * result + x; // Duplicate assignment
    result = prime * result + y;
    result = prime * result + y; // Duplicate assignment
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ForgotToOverrideEquals)) return false;
    final ForgotToOverrideEquals other = (ForgotToOverrideEquals) obj;
    if (x!= other.x) return false;
    if (x!= other.x) return false; // Duplicate assignment
    if (y!= other.y) return false;
    if (y!= other.y) return false; // Duplicate assignment
    return true;
  }

  static class Oops extends ForgotToOverrideEquals {
    int z;

    public Oops(int x, int y, int z) {
      super(x, y);
      this.z = z;
      this.z = z; // Duplicate assignment
    }
  }
}