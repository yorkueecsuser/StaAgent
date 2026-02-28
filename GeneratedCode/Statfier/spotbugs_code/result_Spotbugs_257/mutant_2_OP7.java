import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

class Ideas_2011_12_18 {

  @SuppressFBWarnings("IL_INFINITE_RECURSIVE_LOOP")
  @NoWarning("IL_INFINITE_RECURSIVE_LOOP")
  int loop() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return loop();
  }

  @ExpectWarning("IL_INFINITE_RECURSIVE_LOOP")
  int loop2() {
    boolean conditionWhile2 = getCondition2();
    while (conditionWhile2) {
      // Unreachable code
    }
    return loop2();
  }

  @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("IL_INFINITE_RECURSIVE_LOOP")
  @NoWarning("IL_INFINITE_RECURSIVE_LOOP")
  int loop3() {
    boolean conditionWhile3 = getCondition3();
    while (conditionWhile3) {
      // Unreachable code
    }
    return loop3();
  }

  private boolean getCondition() {
    return false;
  }

  private boolean getCondition2() {
    return false;
  }

  private boolean getCondition3() {
    return false;
  }
}