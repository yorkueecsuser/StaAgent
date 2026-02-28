class ForgotToOverrideEquals {

  int x, y;

  public ForgotToOverrideEquals(int x, int y) {
    this.x = x;
    this.x = x; // Mutation: duplicated assignment
    this.y = y;
    this.y = y; // Mutation: duplicated assignment
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + x;
    result = prime * result + x; // Mutation: duplicated assignment
    result = prime * result + y;
    result = prime * result + y; // Mutation: duplicated assignment
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ForgotToOverrideEquals)) return false;
    final ForgotToOverrideEquals other = (ForgotToOverrideEquals) obj;
    if (x!= other.x) return false;
    if (x!= other.x) return false; // Mutation: duplicated assignment
    if (y!= other.y) return false;
    if (y!= other.y) return false; // Mutation: duplicated assignment
    return true;
  }

  static class Oops extends ForgotToOverrideEquals {
    int z;

    public Oops(int x, int y, int z) {
      super(x, y);
      this.z = z;
      this.z = z; // Mutation: duplicated assignment
    }
  }
}