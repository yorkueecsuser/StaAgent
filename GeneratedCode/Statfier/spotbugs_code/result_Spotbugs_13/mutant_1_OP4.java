import edu.umd.cs.findbugs.annotations.ExpectWarning;

class LongNaming {
  int methodf() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
    }
    return 42;
  }

  static class A extends LongNaming {
    int methodg() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code
      } else {
        // Unreachable code
      }
      return 17;
    }
  }

  static class B extends A {
    @ExpectWarning("Nm")
    int methodF() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code
      } else {
        // Unreachable code
      }
      return 43;
    }

    @ExpectWarning("Nm")
    int methodG() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code
      } else {
        // Unreachable code
      }
      return 18;
    }

    @ExpectWarning("Nm")
    void Wait() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code
      } else {
        // Unreachable code
      }
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the else branch is unreachable
  }
}