import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.imageio.IIOException;

class Bug3204236 {

  Integer j; // to check that findbugs is running

  void f() throws IIOException {
    throw new IIOException("message");
  }

  @ExpectWarning(value = "DE")
  void g() {
    try {
      f();
    } catch (final IIOException e) {
      // Introduced an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This will never run because shouldRun is always false.");
      } else {
        System.out.println("This will also never run because shouldRun is always false.");
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}