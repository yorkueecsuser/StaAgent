import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3433530 {

  int x;

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + x;
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
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
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
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
      // Inserting unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable
      }
      return true;
    }
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false; // This will always return false, making the loop unreachable
  }
}