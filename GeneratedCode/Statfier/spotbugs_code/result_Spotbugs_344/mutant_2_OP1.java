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
    String qgjvbnrf = "unused"; // Dead store
  }

  public static void test2() throws IOException {
    TestStaticObligationAnnotation o = make();
    o.process();
    done();
    int kxmtzvph = 42; // Dead store
  }

  public static void test3() {
    TestStaticObligationAnnotation o = make();
    try {
      o.process();
      boolean hfrtldxz = true; // Dead store
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      done();
    }
  }
}