import edu.umd.cs.findbugs.annotations.ExpectWarning;

class LongNaming {
  int methodf() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return 99;
    }
    return 42;
  }

  static class A extends LongNaming {
    int methodg() {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        return 98;
      }
      return 17;
    }
  }

  static class B extends A {
    @ExpectWarning("Nm")
    int methodF() {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        return 97;
      }
      return 43;
    }

    @ExpectWarning("Nm")
    int methodG() {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        return 96;
      }
      return 18;
    }

    @ExpectWarning("Nm")
    void Wait() {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable");
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}