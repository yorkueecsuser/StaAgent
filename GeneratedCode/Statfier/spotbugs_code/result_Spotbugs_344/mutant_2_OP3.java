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
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable branch");
    }
  }

  public static void test2() throws IOException {
    TestStaticObligationAnnotation o = make();
    o.process();
    done();
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable branch");
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
      // Mutant: Inserting unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable branch");
      }
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This will ensure the condition is always false at runtime
  }
}