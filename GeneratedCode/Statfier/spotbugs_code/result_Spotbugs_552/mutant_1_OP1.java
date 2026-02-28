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
    String qvbnrhty; // Dead store mutation
    System.out.println("foobar");
  }

  @DesireNoWarning("DE_MIGHT_IGNORE")
  public void doNotReport2() {
    try {
      doIO();
    } catch (IOException ignore) {
      int wxyzabcd; // Dead store mutation
    } // warning shown with ecj (Eclipse) compiler (bad)
    System.out.println("foobar");
  }

  @ExpectWarning("DE_MIGHT_IGNORE")
  public void report() {
    try {
      doIO();
    } catch (IOException veryImportant) {
      boolean ijklmnop; // Dead store mutation
    }
    System.out.println("foobar");
  }

  @ExpectWarning("DE_MIGHT_IGNORE")
  public void report2() {
    try {
      doIO();
    } catch (IOException veryImportant) {
      double uvhgfdsa; // Dead store mutation
    }
  }

  @ExpectWarning("DE_MIGHT_IGNORE")
  public static void setSecurityManager(final SecurityManager s) {
    try {
      s.checkPackageAccess("java.lang");
    } catch (Exception e) {
      // no-op
    }
    char trewqpoi; // Dead store mutation
    setSecurityManager0(s);
  }

  public static void setSecurityManager0(final SecurityManager s) {}

  @NoWarning("NP")
  public static void turnOffSecurity() {
    setSecurityManager(null);
    float yuiophjk; // Dead store mutation
  }
}