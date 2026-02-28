class Bug3460234 {
  public static class Base {
    @Override
    @edu.umd.cs.findbugs.annotations.SuppressWarnings(
        value = "EQ_OVERRIDING_EQUALS_NOT_SYMMETRIC",
        justification = "Test code")
    public boolean equals(Object other) {
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left blank to ensure the switch is unreachable
          break;
      }
      if (other instanceof Base) // Marker for the problem shows up here
        // in Eclipse.
        return (this == other);

      return (false);
    }

    @Override
    public int hashCode() {
      return (42);
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined but always false
    }
  }

  public static class Middle extends Base {
    @Override
    @edu.umd.cs.findbugs.annotations.SuppressWarnings(
        value = "EQ_OVERRIDING_EQUALS_NOT_SYMMETRIC",
        justification = "Test code")
    public boolean equals(Object other) {
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left blank to ensure the switch is unreachable
          break;
      }
      if (other instanceof Middle) return (this == other);

      return (false);
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined but always false
    }
  }

  public static class Many extends Middle {
    @Override
    @edu.umd.cs.findbugs.annotations.SuppressWarnings(
        value = "EQ_OVERRIDING_EQUALS_NOT_SYMMETRIC",
        justification = "Test code")
    public boolean equals(Object other) {
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left blank to ensure the switch is unreachable
          break;
      }
      if (other instanceof Many) return (this == other);

      return (false);
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined but always false
    }
  }
}