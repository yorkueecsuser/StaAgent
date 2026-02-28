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
    String xhjvbnrt = "unused"; // Dead store
  }

  public static void test2() throws IOException {
    TestObligationAnnotation o = make();
    o.process();
    o.done();
    int qzwcspfn = 42; // Dead store
  }

  public static void test3() {
    TestObligationAnnotation o = make();
    try {
      o.process();
      boolean klmnopqr = true; // Dead store
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      o.done();
    }
  }
}