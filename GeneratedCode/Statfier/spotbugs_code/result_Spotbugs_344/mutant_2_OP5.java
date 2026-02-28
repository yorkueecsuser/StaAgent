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
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  public static void test2() throws IOException {
    TestStaticObligationAnnotation o = make();
    o.process();
    done();
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable");
        break;
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
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch(condition) {
        case true:
          System.out.println("This is unreachable");
          break;
      }
    }
  }

  private static boolean getCondition() {
    return false; // This ensures the switch statement is unreachable
  }
}