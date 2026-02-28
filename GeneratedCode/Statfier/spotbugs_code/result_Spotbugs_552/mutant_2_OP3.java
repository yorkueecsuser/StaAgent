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
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This will never be printed");
    }
  }

  @DesireNoWarning("DE_MIGHT_IGNORE")
  public void doNotReport2() {
    try {
      doIO();
    } catch (IOException ignore) {
    } // warning shown with ecj (Eclipse) compiler (bad)
    System.out.println("foobar");
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This will never be printed either");
    }
  }

  @ExpectWarning("DE_MIGHT_IGNORE")
  public void report() {
    try {
      doIO();
    } catch (IOException veryImportant) {
    }
    System.out.println("foobar");
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This will never be printed in report");
    }
  }

  @ExpectWarning("DE_MIGHT_IGNORE")
  public void report2() {
    try {
      doIO();
    } catch (IOException veryImportant) {
    }
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This will never be printed in report2");
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
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This will never be printed in setSecurityManager");
    }
  }

  public static void setSecurityManager0(final SecurityManager s) {}

  @NoWarning("NP")
  public static void turnOffSecurity() {
    setSecurityManager(null);
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This will never be printed in turnOffSecurity");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}