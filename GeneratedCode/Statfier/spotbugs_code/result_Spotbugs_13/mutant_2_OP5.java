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
      return 43;
    }

    @ExpectWarning("Nm")
    int methodG() {
      return 18;
    }

    @ExpectWarning("Nm")
    void Wait() {}

    // Inserting an unreachable switch statement
    void someMethod() {
      boolean condition = getCondition();
      switch (getValue(condition)) {
        case 1:
          System.out.println("This will never be printed");
          break;
        case 2:
          System.out.println("This will also never be printed");
          break;
      }
    }

    private boolean getCondition() {
      return false; // This ensures the condition is dynamically determined but always false
    }

    private int getValue(boolean condition) {
      return condition? 1 : 0; // Always returns 0, making the switch statement unreachable
    }
  }
}