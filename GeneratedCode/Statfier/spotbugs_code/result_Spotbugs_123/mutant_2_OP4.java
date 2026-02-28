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

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      System.out.println("This should never be printed");
    } else {
      // Alternative block
      System.out.println("This will always be printed");
    }
  }

  private boolean getCondition() {
    // Always returns false, making the 'if' block unreachable
    return false;
  }
}