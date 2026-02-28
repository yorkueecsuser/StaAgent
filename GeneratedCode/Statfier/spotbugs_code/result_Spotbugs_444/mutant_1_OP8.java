class Bug3460234 {
  public static class Base {
    @Override
    @edu.umd.cs.findbugs.annotations.SuppressWarnings(
        value = "EQ_OVERRIDING_EQUALS_NOT_SYMMETRIC",
        justification = "Test code")
    public boolean equals(Object x) {
      if (x instanceof Base) // Marker for the problem shows up here
        // in Eclipse.
        return (this == x);

      return (false);
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
    public boolean equals(Object y) {
      if (y instanceof Middle) return (this == y);

      return (false);
    }
  }

  public static class Many extends Middle {
    @Override
    @edu.umd.cs.findbugs.annotations.SuppressWarnings(
        value = "EQ_OVERRIDING_EQUALS_NOT_SYMMETRIC",
        justification = "Test code")
    public boolean equals(Object z) {
      if (z instanceof Many) return (this == z);

      return (false);
    }
  }
}