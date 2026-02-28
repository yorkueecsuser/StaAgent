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
      // Inserting an unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable statement.");
      }
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}