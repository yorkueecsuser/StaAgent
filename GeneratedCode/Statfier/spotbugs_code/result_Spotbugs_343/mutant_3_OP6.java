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
    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }
  }

  public static void test2() throws IOException {
    TestObligationAnnotation o = make();
    o.process();
    o.done();
    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
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
    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }
  }

  private static boolean getCondition() {
    return false;
  }
}