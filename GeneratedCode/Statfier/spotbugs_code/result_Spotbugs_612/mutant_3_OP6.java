import edu.umd.cs.findbugs.annotations.ExpectWarning;

class MethodCapitalization {
  public void MethodCapitalization() {}

  public int getX() {
    return 42;
  }

  @ExpectWarning("Nm")
  public int hashcode() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return 42;
  }

  @ExpectWarning("Nm")
  public String tostring() {
    return "MethodCapitalization";
  }

  static class Foo extends MethodCapitalization {
    @ExpectWarning("Nm")
    public int getx() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      return 42;
    }
  }

  static class Bar {
    public int getx() {
      return 42;
    }

    @ExpectWarning("Nm")
    public String ToString() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      return "Bar";
    }
  }

  private boolean getCondition() {
    return false;
  }
}