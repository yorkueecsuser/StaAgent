import annotations.DetectorUnderTest;
import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import edu.umd.cs.findbugs.detect.DroppedException;
import java.io.IOException;

@DetectorUnderTest(DroppedException.class)
public abstract class Ideas_2011_08_10 {

  public abstract void doIO() throws IOException;

  @NoWarning("DE_MIGHT_IGNORE")
  public void doNotReport() {
    try {
      doIO();
    } catch (IOException ignore) {
      // for brace on next line warning not shown with ecj (Eclipse) compiler (ok)
    }
    System.out.println("foobar");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never be executed
      System.out.println("This is an unreachable if block");
    } else {
      // This block should always be executed
      System.out.println("This is the reachable else block");
    }
  }

  @DesireNoWarning("DE_MIGHT_IGNORE")
  public void doNotReport2() {
    try {
      doIO();
    } catch (IOException ignore) {
    } // warning shown with ecj (Eclipse) compiler (bad)
    System.out.println("foobar");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never be executed
      System.out.println("This is an unreachable if block");
    } else {
      // This block should always be executed
      System.out.println("This is the reachable else block");
    }
  }

  @ExpectWarning("DE_MIGHT_IGNORE")
  public void report() {
    try {
      doIO();
    } catch (IOException veryImportant) {
    }
    System.out.println("foobar");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never be executed
      System.out.println("This is an unreachable if block");
    } else {
      // This block should always be executed
      System.out.println("This is the reachable else block");
    }
  }

  @ExpectWarning("DE_MIGHT_IGNORE")
  public void report2() {
    try {
      doIO();
    } catch (IOException veryImportant) {
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never be executed
      System.out.println("This is an unreachable if block");
    } else {
      // This block should always be executed
      System.out.println("This is the reachable else block");
    }
  }

  @ExpectWarning("DE_MIGHT_IGNORE")
  public static void setSecurityManager(final SecurityManager s) {
    try {
      s.checkPackageAccess("java.lang");
    } catch (Exception e) {
      // no-op
    }
    setSecurityManager0(s);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never be executed
      System.out.println("This is an unreachable if block");
    } else {
      // This block should always be executed
      System.out.println("This is the reachable else block");
    }
  }

  public static void setSecurityManager0(final SecurityManager s) {}

  @NoWarning("NP")
  public static void turnOffSecurity() {
    setSecurityManager(null);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never be executed
      System.out.println("This is an unreachable if block");
    } else {
      // This block should always be executed
      System.out.println("This is the reachable else block");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}