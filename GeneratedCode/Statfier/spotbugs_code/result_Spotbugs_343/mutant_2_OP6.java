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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      System.out.println("This is an unreachable loop in test1");
    }
  }

  public static void test2() throws IOException {
    TestObligationAnnotation o = make();
    o.process();
    o.done();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      System.out.println("This is an unreachable loop in test2");
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      System.out.println("This is an unreachable loop in test3");
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}