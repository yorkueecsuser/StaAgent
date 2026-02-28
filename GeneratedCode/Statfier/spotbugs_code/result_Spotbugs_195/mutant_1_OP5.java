import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3433530 {

  int x;

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + x;
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        result += 100;
        break;
      default:
        // Default case will also not be reached due to the same reason
        result += 200;
        break;
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
      // Inserting an unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case will never be reached because condition is always false
          equalsCalls += 100;
          break;
        default:
          // Default case will also not be reached due to the same reason
          equalsCalls += 200;
          break;
      }
      return true;
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}