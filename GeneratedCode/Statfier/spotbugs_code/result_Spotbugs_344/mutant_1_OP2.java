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
    // Mutant: Duplicate assignment
    TestStaticObligationAnnotation o1 = make();
    TestStaticObligationAnnotation o1 = make();
  }

  public static void test2() throws IOException {
    TestStaticObligationAnnotation o = make();
    o.process();
    done();
    // Mutant: Duplicate assignment
    TestStaticObligationAnnotation o2 = make();
    TestStaticObligationAnnotation o2 = make();
  }

  public static void test3() {
    TestStaticObligationAnnotation o = make();
    try {
      o.process();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      done();
      // Mutant: Duplicate assignment
      TestStaticObligationAnnotation o3 = make();
      TestStaticObligationAnnotation o3 = make();
    }
  }
}