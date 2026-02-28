import edu.umd.cs.findbugs.annotations.ExpectWarning;

class LongNaming {
  int methodf() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return 42;
  }

  static class A extends LongNaming {
    int methodg() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return 17;
    }
  }

  static class B extends A {
    @ExpectWarning("Nm")
    int methodF() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return 43;
    }

    @ExpectWarning("Nm")
    int methodG() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return 18;
    }

    @ExpectWarning("Nm")
    void Wait() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}