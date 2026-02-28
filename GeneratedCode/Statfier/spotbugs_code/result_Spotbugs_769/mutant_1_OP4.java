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

    // Introduced an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable block.");
    } else {
      // This block will always execute
      System.out.println("This block will always execute.");
    }
  }

  private boolean getCondition() {
    // Always return false to make the if-block unreachable
    return false;
  }
}