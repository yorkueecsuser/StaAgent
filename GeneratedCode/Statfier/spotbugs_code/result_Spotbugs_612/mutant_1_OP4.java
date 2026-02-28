import edu.umd.cs.findbugs.annotations.ExpectWarning;

class MethodCapitalization {
  public void MethodCapitalization() {}

  public int getX() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable code due to shouldRun always being false
    }
    return 42;
  }

  @ExpectWarning("Nm")
  public int hashcode() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable code due to shouldRun always being false
    }
    return 42;
  }

  @ExpectWarning("Nm")
  public String tostring() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable code due to shouldRun always being false
    }
    return "MethodCapitalization";
  }

  static class Foo extends MethodCapitalization {
    @ExpectWarning("Nm")
    public int getx() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if shouldRun is true
      } else {
        // Unreachable code due to shouldRun always being false
      }
      return 42;
    }
  }

  static class Bar {
    public int getx() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if shouldRun is true
      } else {
        // Unreachable code due to shouldRun always being false
      }
      return 42;
    }

    @ExpectWarning("Nm")
    public String ToString() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if shouldRun is true
      } else {
        // Unreachable code due to shouldRun always being false
      }
      return "Bar";
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else branch unreachable
  }
}