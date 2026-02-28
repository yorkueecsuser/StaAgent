import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

class Ideas_2011_12_18 {

  @SuppressFBWarnings("IL_INFINITE_RECURSIVE_LOOP")
  @NoWarning("IL_INFINITE_RECURSIVE_LOOP")
  int loop() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in loop method.");
    }
    return loop();
  }

  @ExpectWarning("IL_INFINITE_RECURSIVE_LOOP")
  int loop2() {
    boolean condition2 = getCondition2();
    if (condition2) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in loop2 method.");
    }
    return loop2();
  }

  @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("IL_INFINITE_RECURSIVE_LOOP")
  @NoWarning("IL_INFINITE_RECURSIVE_LOOP")
  int loop3() {
    boolean condition3 = getCondition3();
    if (condition3) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in loop3 method.");
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