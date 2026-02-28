import edu.umd.cs.findbugs.annotations.ExpectWarning;

class MethodCapitalization {
  public void MethodCapitalization() {}

  public int getX() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return 42;
  }

  @ExpectWarning("Nm")
  public int hashcode() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return 42;
  }

  @ExpectWarning("Nm")
  public String tostring() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return "MethodCapitalization";
  }

  static class Foo extends MethodCapitalization {
    @ExpectWarning("Nm")
    public int getx() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      return 42;
    }
  }

  static class Bar {
    public int getx() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      return 42;
    }

    @ExpectWarning("Nm")
    public String ToString() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      return "Bar";
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}