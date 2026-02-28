import edu.umd.cs.findbugs.annotations.ExpectWarning;

class MethodCapitalization {
  public void MethodCapitalization() {}

  public int getX() {
    return 42;
  }

  @ExpectWarning("Nm")
  public int hashcode() {
    return 42;
  }

  @ExpectWarning("Nm")
  public String tostring() {
    return "MethodCapitalization";
  }

  static class Foo extends MethodCapitalization {
    @ExpectWarning("Nm")
    public int getx() {
      return 42;
    }
  }

  static class Bar {
    public int getx() {
      return 42;
    }

    @ExpectWarning("Nm")
    public String ToString() {
      return "Bar";
    }
  }

  // Added unreachable switch statement
  public void someMethod() {
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is never reached");
        break;
      case 2:
        System.out.println("This is also never reached");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This ensures the condition is dynamically determined but always false
  }

  private int getValue(boolean condition) {
    if (condition) {
      return 1;
    } else {
      return 0; // Always returns 0, making the switch statement unreachable
    }
  }
}