import edu.umd.cs.findbugs.annotations.ExpectWarning;

class MethodCapitalization {
  public void MethodCapitalization() {}

  public int getX() {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      return 24;
    }
    return 42;
  }

  @ExpectWarning("Nm")
  public int hashcode() {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      return 24;
    }
    return 42;
  }

  @ExpectWarning("Nm")
  public String tostring() {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      return "Unreachable";
    }
    return "MethodCapitalization";
  }

  static class Foo extends MethodCapitalization {
    @ExpectWarning("Nm")
    public int getx() {
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() always returns false
        return 24;
      }
      return 42;
    }
  }

  static class Bar {
    public int getx() {
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() always returns false
        return 24;
      }
      return 42;
    }

    @ExpectWarning("Nm")
    public String ToString() {
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() always returns false
        return "Unreachable";
      }
      return "Bar";
    }
  }

  private boolean getCondition() {
    return false;
  }
}