class Bug3460234 {
  public static class Base {
    @Override
    @edu.umd.cs.findbugs.annotations.SuppressWarnings(
        value = "EQ_OVERRIDING_EQUALS_NOT_SYMMETRIC",
        justification = "Test code")
    public boolean equals(Object other) {
      if (other instanceof Base) // Marker for the problem shows up here
        // in Eclipse.
        return (this == other);

      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in Base");
      } else {
        // Another unreachable code
        System.out.println("This is another unreachable code in Base");
      }

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
      if (other instanceof Middle) return (this == other);

      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in Middle");
      } else {
        // Another unreachable code
        System.out.println("This is another unreachable code in Middle");
      }

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
      if (other instanceof Many) return (this == other);

      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in Many");
      } else {
        // Another unreachable code
        System.out.println("This is another unreachable code in Many");
      }

      return (false);
    }

    private boolean getCondition() {
        return false;
    }
  }
}