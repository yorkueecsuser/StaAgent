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
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case to ensure the switch is not empty and reachable
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}