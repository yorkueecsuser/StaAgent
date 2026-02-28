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
    // Mutant: Renaming 'o' to 'a'
    TestObligationAnnotation a = make();
    a.process();
  }

  public static void test2() throws IOException {
    TestObligationAnnotation o = make();
    o.process();
    o.done();
    // Mutant: Renaming 'o' to 'b'
    TestObligationAnnotation b = make();
    b.process();
    b.done();
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
    // Mutant: Renaming 'o' to 'c'
    TestObligationAnnotation c = make();
    try {
      c.process();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      c.done();
    }
  }
}