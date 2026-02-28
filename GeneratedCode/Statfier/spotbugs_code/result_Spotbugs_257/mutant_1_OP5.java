import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

class Ideas_2011_12_18 {

  @SuppressFBWarnings("IL_INFINITE_RECURSIVE_LOOP")
  @NoWarning("IL_INFINITE_RECURSIVE_LOOP")
  int loop() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is unreachable");
        break;
    }
    return loop();
  }

  @ExpectWarning("IL_INFINITE_RECURSIVE_LOOP")
  int loop2() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is unreachable");
        break;
    }
    return loop2();
  }

  @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("IL_INFINITE_RECURSIVE_LOOP")
  @NoWarning("IL_INFINITE_RECURSIVE_LOOP")
  int loop3() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is unreachable");
        break;
    }
    return loop3();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the switch case unreachable
  }
}