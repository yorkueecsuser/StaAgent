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
      String qzvbnrht = "unusedVariable"; // Dead Store mutation
    } catch (final IIOException e) {
    }
  }
}