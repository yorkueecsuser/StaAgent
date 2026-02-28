import edu.umd.cs.findbugs.annotations.ExpectWarning;

class MethodCapitalization {
  public void MethodCapitalization() {}

  public int getX() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return 42;
  }

  @ExpectWarning("Nm")
  public int hashcode() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return 42;
  }

  @ExpectWarning("Nm")
  public String tostring() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return "MethodCapitalization";
  }

  static class Foo extends MethodCapitalization {
    @ExpectWarning("Nm")
    public int getx() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return 42;
    }
  }

  static class Bar {
    public int getx() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return 42;
    }

    @ExpectWarning("Nm")
    public String ToString() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return "Bar";
    }
  }

  private boolean getCondition() {
    return false;
  }
}