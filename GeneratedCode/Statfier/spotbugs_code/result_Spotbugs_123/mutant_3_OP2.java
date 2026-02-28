import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.applet.Applet;
import java.net.URL;

class BadApplet extends Applet {
  @ExpectWarning("Dm")
  public BadApplet() {
    URL u1 = getDocumentBase();
    URL u1_duplicate = getDocumentBase(); // Duplicate of u1 assignment

    URL u2 = getCodeBase();
    URL u2_duplicate = getCodeBase(); // Duplicate of u2 assignment

    if (u1.equals(u2)) return;

    if (getParameter("bad")!= null) return;

    if (getAppletContext()!= null) return;
  }
}