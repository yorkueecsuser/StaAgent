import edu.umd.cs.findbugs.annotations.ExpectWarning;

class MethodCapitalization {
  public void MethodCapitalization() {}

  public int getX() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return 0;
    }
    return 42;
  }

  @ExpectWarning("Nm")
  public int hashcode() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return 0;
    }
    return 42;
  }

  @ExpectWarning("Nm")
  public String tostring() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return "";
    }
    return "MethodCapitalization";
  }

  static class Foo extends MethodCapitalization {
    @ExpectWarning("Nm")
    public int getx() {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        return 0;
      }
      return 42;
    }
  }

  static class Bar {
    public int getx() {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        return 0;
      }
      return 42;
    }

    @ExpectWarning("Nm")
    public String ToString() {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        return "";
      }
      return "Bar";
    }
  }

  private boolean getCondition() {
    return false;
  }
}