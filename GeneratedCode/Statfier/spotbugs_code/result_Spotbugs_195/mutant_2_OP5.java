import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3433530 {

  int x;

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + x;
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        result += 100;
        break;
    }
    return result;
  }

  private boolean getCondition() {
    return false;
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
      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          equalsCalls += 100;
          break;
      }
      return true;
    }

    private boolean getCondition() {
      return false;
    }
  }
}