import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.applet.Applet;
import java.net.URL;

class BadApplet extends Applet {
  @ExpectWarning("Dm")
  public BadApplet() {
    URL u1 = getDocumentBase();
    URL u2 = getCodeBase();

    if (u1.equals(u2)) return;

    if (getParameter("bad")!= null) return;

    if (getAppletContext()!= null) return;

    // Mutant code: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}