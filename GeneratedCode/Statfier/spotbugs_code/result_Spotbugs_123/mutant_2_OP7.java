import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.applet.Applet;
import java.net.URL;

class BadApplet extends Applet {
  @ExpectWarning("Dm")
  public BadApplet() {
    URL u1 = getDocumentBase();
    URL u2 = getCodeBase();

    if (u1.equals(u2)) return;

    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() should return false
    }

    if (getParameter("bad")!= null) return;

    if (getAppletContext()!= null) return;
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false; // This ensures the loop is unreachable
  }
}