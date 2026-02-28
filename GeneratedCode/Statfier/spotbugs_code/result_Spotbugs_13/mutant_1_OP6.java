import edu.umd.cs.findbugs.annotations.ExpectWarning;

class LongNaming {
  int methodf() {
    return 42;
  }

  static class A extends LongNaming {
    int methodg() {
      return 17;
    }
  }

  static class B extends A {
    @ExpectWarning("Nm")
    int methodF() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      return 43;
    }

    @ExpectWarning("Nm")
    int methodG() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Another unreachable loop
      }
      return 18;
    }

    @ExpectWarning("Nm")
    void Wait() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Yet another unreachable loop
      }
    }

    private boolean getCondition() {
      return false;
    }
  }
}