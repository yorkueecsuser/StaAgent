import edu.umd.cs.findbugs.annotations.NoWarning;
import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

/*
* Pattern that can be found in various NetBeans sources
is to find ancestor of some component in AWT hierarchy
using SwingUtilities.getAncestorOfClass. Although this
method returns Container according to method contract
it is safe to cast it to a class that is used as first
argument. An example of code looks like this:

*/
class Bug1557886 {
  @NoWarning("BC")
  public void actionPerformed(ActionEvent e) {
    Component c = (Component) e.getSource();
    JPopupMenu jpm = (JPopupMenu) SwingUtilities.getAncestorOfClass(JPopupMenu.class, c);

    // Introduced an unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse) {
      case true:
        System.out.println("This will never be printed");
        break;
      default:
        System.out.println("This will also never be printed");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}