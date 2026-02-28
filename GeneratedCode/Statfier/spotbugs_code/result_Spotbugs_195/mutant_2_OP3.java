import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3433530 {

  int x;

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + x;
    // Introduced an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      result = result * 2; // This line is unreachable
    }
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (!(obj instanceof Bug3433530)) return false;
    Bug3433530 other = (Bug3433530) obj;
    if (x!= other.x) return false;
    // Introduced an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return false; // This line is unreachable
    }
    return true;
  }

  static class Subclass extends Bug3433530 {
    static int equalsCalls = 0;

    @NoWarning("EQ_OVERRIDING_EQUALS_NOT_SYMMETRIC")
    @Override
    public boolean equals(Object obj) {
      equalsCalls++;
      if (this == obj) return true;
      if (obj == null) return false;
      if (!(obj instanceof Bug3433530)) return false;
      Bug3433530 other = (Bug3433530) obj;
      if (x!= other.x) return false;
      // Introduced an unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        return false; // This line is unreachable
      }
      return true;
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if blocks are unreachable
  }
}