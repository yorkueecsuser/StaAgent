import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

class Ideas_2011_12_18 {

  @SuppressFBWarnings("IL_INFINITE_RECURSIVE_LOOP")
  @NoWarning("IL_INFINITE_RECURSIVE_LOOP")
  int loop() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed because condition is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that will also never be executed because condition is always false
      System.out.println("This is an unreachable else block.");
    }
    return loop();
  }

  @ExpectWarning("IL_INFINITE_RECURSIVE_LOOP")
  int loop2() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed because condition is always false
      System.out.println("This is another unreachable if block.");
    } else {
      // Some alternative code that will also never be executed because condition is always false
      System.out.println("This is another unreachable else block.");
    }
    return loop2();
  }

  @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("IL_INFINITE_RECURSIVE_LOOP")
  @NoWarning("IL_INFINITE_RECURSIVE_LOOP")
  int loop3() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed because condition is always false
      System.out.println("Yet another unreachable if block.");
    } else {
      // Some alternative code that will also never be executed because condition is always false
      System.out.println("Yet another unreachable else block.");
    }
    return loop3();
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else branches are unreachable
  }
}