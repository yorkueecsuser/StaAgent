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
      // Introduced an unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() will return false
      }
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}