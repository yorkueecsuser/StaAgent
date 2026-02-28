import edu.umd.cs.findbugs.annotations.ExpectWarning;

class MethodCapitalization {
  public void MethodCapitalization() {}

  public int getX() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        System.out.println("This is unreachable");
        break;
    }
    return 42;
  }

  @ExpectWarning("Nm")
  public int hashcode() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        System.out.println("This is unreachable");
        break;
    }
    return 42;
  }

  @ExpectWarning("Nm")
  public String tostring() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        System.out.println("This is unreachable");
        break;
    }
    return "MethodCapitalization";
  }

  static class Foo extends MethodCapitalization {
    @ExpectWarning("Nm")
    public int getx() {
      boolean condition = getCondition();
      switch (condition? 0 : 1) { // Unreachable switch statement
        case 0:
          System.out.println("This is unreachable");
          break;
      }
      return 42;
    }
  }

  static class Bar {
    public int getx() {
      boolean condition = getCondition();
      switch (condition? 0 : 1) { // Unreachable switch statement
        case 0:
          System.out.println("This is unreachable");
          break;
      }
      return 42;
    }

    @ExpectWarning("Nm")
    public String ToString() {
      boolean condition = getCondition();
      switch (condition? 0 : 1) { // Unreachable switch statement
        case 0:
          System.out.println("This is unreachable");
          break;
      }
      return "Bar";
    }
  }

  private boolean getCondition() {
    return false;
  }
}