import edu.umd.cs.findbugs.annotations.ExpectWarning;

class MethodCapitalization {
  public void MethodCapitalization() {}

  public int getX() {
    boolean condition = getCondition();
    switch (getValue()) {
      case 1:
        // This case is unreachable because getValue() never returns 1
        System.out.println("This is an unreachable case");
        break;
    }
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
      boolean condition = getCondition();
      switch (getValue()) {
        case 2:
          // This case is unreachable because getValue() never returns 2
          System.out.println("This is another unreachable case");
          break;
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
      boolean condition = getCondition();
      switch (getValue()) {
        case 3:
          // This case is unreachable because getValue() never returns 3
          System.out.println("Yet another unreachable case");
          break;
      }
      return "Bar";
    }
  }

  private boolean getCondition() {
    return false;
  }

  private int getValue() {
    return 0;
  }
}