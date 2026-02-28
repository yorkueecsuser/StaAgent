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
    
    // Mutated code
    URL v1 = getDocumentBase();
    URL v2 = getCodeBase();

    if (v1.equals(v2)) return;

    if (getParameter("bad")!= null) return;

    if (getAppletContext()!= null) return;
  }
}