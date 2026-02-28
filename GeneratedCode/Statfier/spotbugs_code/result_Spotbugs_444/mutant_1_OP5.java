class Bug3460234 {
  public static class Base {
    @Override
    @edu.umd.cs.findbugs.annotations.SuppressWarnings(
        value = "EQ_OVERRIDING_EQUALS_NOT_SYMMETRIC",
        justification = "Test code")
    public boolean equals(Object other) {
      boolean condition = getCondition();
      switch(condition) {
        case true: // This case will never be reached because getCondition() does not return true
          System.out.println("This is an unreachable switch case");
          break;
      }
      if (other instanceof Base) // Marker for the problem shows up here
        // in Eclipse.
        return (this == other);

      return (false);
    }

    private boolean getCondition() {
      return false; // This method always returns false, making the switch case unreachable
    }

    @Override
    public int hashCode() {
      return (42);
    }
  }

  public static class Middle extends Base {
    @Override
    @edu.umd.cs.findbugs.annotations.SuppressWarnings(
        value = "EQ_OVERRIDING_EQUALS_NOT_SYMMETRIC",
        justification = "Test code")
    public boolean equals(Object other) {
      boolean condition = getCondition();
      switch(condition) {
        case true: // This case will never be reached because getCondition() does not return true
          System.out.println("This is an unreachable switch case");
          break;
      }
      if (other instanceof Middle) return (this == other);

      return (false);
    }

    private boolean getCondition() {
      return false; // This method always returns false, making the switch case unreachable
    }
  }

  public static class Many extends Middle {
    @Override
    @edu.umd.cs.findbugs.annotations.SuppressWarnings(
        value = "EQ_OVERRIDING_EQUALS_NOT_SYMMETRIC",
        justification = "Test code")
    public boolean equals(Object other) {
      boolean condition = getCondition();
      switch(condition) {
        case true: // This case will never be reached because getCondition() does not return true
          System.out.println("This is an unreachable switch case");
          break;
      }
      if (other instanceof Many) return (this == other);

      return (false);
    }

    private boolean getCondition() {
      return false; // This method always returns false, making the switch case unreachable
    }
  }
}