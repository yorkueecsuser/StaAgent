import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

class Ideas_2011_12_18 {

  @SuppressFBWarnings("IL_INFINITE_RECURSIVE_LOOP")
  @NoWarning("IL_INFINITE_RECURSIVE_LOOP")
  int loop() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that won't execute due to shouldRun being false
      System.out.println("This will never print");
    } else {
      // Alternative code that also won't execute due to shouldRun being false
      System.out.println("This will also never print");
    }
    return loop();
  }

  @ExpectWarning("IL_INFINITE_RECURSIVE_LOOP")
  int loop2() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that won't execute due to shouldRun being false
      System.out.println("This will never print in loop2");
    } else {
      // Alternative code that also won't execute due to shouldRun being false
      System.out.println("This will also never print in loop2");
    }
    return loop2();
  }

  @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("IL_INFINITE_RECURSIVE_LOOP")
  @NoWarning("IL_INFINITE_RECURSIVE_LOOP")
  int loop3() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that won't execute due to shouldRun being false
      System.out.println("This will never print in loop3");
    } else {
      // Alternative code that also won't execute due to shouldRun being false
      System.out.println("This will also never print in loop3");
    }
    return loop3();
  }

  private boolean getCondition() {
    return false;
  }
}