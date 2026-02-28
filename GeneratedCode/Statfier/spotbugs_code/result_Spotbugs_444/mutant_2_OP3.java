class Bug3460234 {
  public static class Base {
    @Override
    @edu.umd.cs.findbugs.annotations.SuppressWarnings(
        value = "EQ_OVERRIDING_EQUALS_NOT_SYMMETRIC",
        justification = "Test code")
    public boolean equals(Object other) {
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        System.out.println("This is an unreachable statement in Base");
      }
      if (other instanceof Base) // Marker for the problem shows up here
        // in Eclipse.
        return (this == other);

      return (false);
    }

    private boolean getCondition() {
      return false;
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
      if (condition) { // Unreachable if statement
        System.out.println("This is an unreachable statement in Middle");
      }
      if (other instanceof Middle) return (this == other);

      return (false);
    }

    private boolean getCondition() {
      return false;
    }
  }

  public static class Many extends Middle {
    @Override
    @edu.umd.cs.findbugs.annotations.SuppressWarnings(
        value = "EQ_OVERRIDING_EQUALS_NOT_SYMMETRIC",
        justification = "Test code")
    public boolean equals(Object other) {
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        System.out.println("This is an unreachable statement in Many");
      }
      if (other instanceof Many) return (this == other);

      return (false);
    }

    private boolean getCondition() {
      return false;
    }
  }
}