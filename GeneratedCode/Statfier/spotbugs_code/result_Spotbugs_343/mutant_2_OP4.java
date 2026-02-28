import edu.umd.cs.findbugs.annotations.CleanupObligation;
import edu.umd.cs.findbugs.annotations.CreatesObligation;
import edu.umd.cs.findbugs.annotations.DischargesObligation;
import java.io.IOException;

@CleanupObligation
class TestObligationAnnotation {

  public static @CreatesObligation TestObligationAnnotation make() {
    return new TestObligationAnnotation();
  }

  void process() throws IOException {}

  public @DischargesObligation void done() {}

  public static void test1() throws IOException {
    TestObligationAnnotation o = make();
    o.process();
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      System.out.println("This is an unreachable if block in test1");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block in test1");
    }
  }

  public static void test2() throws IOException {
    TestObligationAnnotation o = make();
    o.process();
    o.done();
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      System.out.println("This is an unreachable if block in test2");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block in test2");
    }
  }

  public static void test3() {
    TestObligationAnnotation o = make();
    try {
      o.process();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      o.done();
    }
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      System.out.println("This is an unreachable if block in test3");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block in test3");
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, making the if-else branches unreachable
  }
}