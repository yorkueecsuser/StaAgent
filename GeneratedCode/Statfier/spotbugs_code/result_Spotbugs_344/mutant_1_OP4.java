import edu.umd.cs.findbugs.annotations.CleanupObligation;
import edu.umd.cs.findbugs.annotations.CreatesObligation;
import edu.umd.cs.findbugs.annotations.DischargesObligation;
import java.io.IOException;

@CleanupObligation
class TestStaticObligationAnnotation {

  public static @CreatesObligation TestStaticObligationAnnotation make() {
    return new TestStaticObligationAnnotation();
  }

  void process() throws IOException {}

  public static @DischargesObligation void done() {}

  public static void test1() throws IOException {
    TestStaticObligationAnnotation o = make();
    o.process();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print in test1");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never print in test1");
    }
  }

  public static void test2() throws IOException {
    TestStaticObligationAnnotation o = make();
    o.process();
    done();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print in test2");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never print in test2");
    }
  }

  public static void test3() {
    TestStaticObligationAnnotation o = make();
    try {
      o.process();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      done();
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print in test3");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never print in test3");
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}