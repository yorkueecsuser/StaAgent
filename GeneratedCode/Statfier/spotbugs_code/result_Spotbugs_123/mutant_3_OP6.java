import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.applet.Applet;
import java.net.URL;

class BadApplet extends Applet {
  @ExpectWarning("Dm")
  public BadApplet() {
    URL u1 = getDocumentBase();
    URL u2 = getCodeBase();

    if (u1.equals(u2)) return;

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() should return false
    }

    if (getParameter("bad")!= null) return;

    if (getAppletContext()!= null) return;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}