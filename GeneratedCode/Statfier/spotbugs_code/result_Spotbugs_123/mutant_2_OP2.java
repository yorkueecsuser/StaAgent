import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.applet.Applet;
import java.net.URL;

class BadApplet extends Applet {
  @ExpectWarning("Dm")
  public BadApplet() {
    URL u1 = getDocumentBase();
    URL u1_duplicate = getDocumentBase(); // Duplicate assignment

    URL u2 = getCodeBase();
    URL u2_duplicate = getCodeBase(); // Duplicate assignment

    if (u1.equals(u2)) return;

    if (getParameter("bad")!= null) return;

    if (getAppletContext()!= null) return;
  }
}