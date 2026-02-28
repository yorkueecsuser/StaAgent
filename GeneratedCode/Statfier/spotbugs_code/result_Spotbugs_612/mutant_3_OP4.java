import edu.umd.cs.findbugs.annotations.ExpectWarning;

class MethodCapitalization {
  public void MethodCapitalization() {}

  public int getX() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block in getX method.");
    }
    return 42;
  }

  @ExpectWarning("Nm")
  public int hashcode() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block in hashcode method.");
    }
    return 42;
  }

  @ExpectWarning("Nm")
  public String tostring() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block in tostring method.");
    }
    return "MethodCapitalization";
  }

  static class Foo extends MethodCapitalization {
    @ExpectWarning("Nm")
    public int getx() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code
      } else {
        // Unreachable code
        System.out.println("This is an unreachable else block in getx method of Foo class.");
      }
      return 42;
    }
  }

  static class Bar {
    public int getx() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code
      } else {
        // Unreachable code
        System.out.println("This is an unreachable else block in getx method of Bar class.");
      }
      return 42;
    }

    @ExpectWarning("Nm")
    public String ToString() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code
      } else {
        // Unreachable code
        System.out.println("This is an unreachable else block in ToString method of Bar class.");
      }
      return "Bar";
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the else block is unreachable
  }
}