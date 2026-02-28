import edu.umd.cs.findbugs.annotations.ExpectWarning;

class LongNaming {
  int methodf() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        return 99;
      default:
        return 42;
    }
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
    void Wait() {
      boolean conditionSwitch = getCondition();
      switch (conditionSwitch? 0 : 1) {
        case 0:
          // This case is unreachable because conditionSwitch is always false
          System.out.println("Unreachable");
          break;
        default:
          // Default case
          break;
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}