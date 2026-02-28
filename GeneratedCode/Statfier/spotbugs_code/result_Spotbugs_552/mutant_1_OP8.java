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
  }

  @DesireNoWarning("DE_MIGHT_IGNORE")
  public void doNotReport2() {
    try {
      doIO();
    } catch (IOException ignore) {
    } // warning shown with ecj (Eclipse) compiler (bad)
    System.out.println("foobar");
  }

  @ExpectWarning("DE_MIGHT_IGNORE")
  public void report() {
    try {
      doIO();
    } catch (IOException veryImportant) {
    }
    System.out.println("foobar");
  }

  @ExpectWarning("DE_MIGHT_IGNORE")
  public void report2() {
    try {
      doIO();
    } catch (IOException veryImportant) {
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
  }

  public static void setSecurityManager0(final SecurityManager s) {}

  @NoWarning("NP")
  public static void turnOffSecurity() {
    setSecurityManager(null);
  }

  // Mutated code
  @NoWarning("DE_MIGHT_IGNORE")
  public void doNotReportX() {
    try {
      doIO();
    } catch (IOException x) {
      // for brace on next line warning not shown with ecj (Eclipse) compiler (ok)
    }
    System.out.println("foobar");
  }

  @DesireNoWarning("DE_MIGHT_IGNORE")
  public void doNotReportY() {
    try {
      doIO();
    } catch (IOException y) {
    } // warning shown with ecj (Eclipse) compiler (bad)
    System.out.println("foobar");
  }

  @ExpectWarning("DE_MIGHT_IGNORE")
  public void reportZ() {
    try {
      doIO();
    } catch (IOException z) {
    }
    System.out.println("foobar");
  }

  @ExpectWarning("DE_MIGHT_IGNORE")
  public void reportW() {
    try {
      doIO();
    } catch (IOException w) {
    }
  }

  @ExpectWarning("DE_MIGHT_IGNORE")
  public static void setSecurityManagerA(final SecurityManager a) {
    try {
      a.checkPackageAccess("java.lang");
    } catch (Exception e) {
      // no-op
    }
    setSecurityManager0(a);
  }

  public static void setSecurityManagerB(final SecurityManager b) {}

  @NoWarning("NP")
  public static void turnOffSecurityC() {
    setSecurityManager(null);
  }
}