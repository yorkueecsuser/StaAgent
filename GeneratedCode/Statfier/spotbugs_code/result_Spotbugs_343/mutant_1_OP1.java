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
    // Dead store mutation
    String qvwjfnxy = "unusedVariable";
  }

  public static void test2() throws IOException {
    TestObligationAnnotation o = make();
    o.process();
    o.done();
    // Dead store mutation
    int rhtyuiop = 42;
  }

  public static void test3() {
    TestObligationAnnotation o = make();
    try {
      o.process();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      o.done();
      // Dead store mutation
      boolean asdfghjk = true;
    }
  }
}