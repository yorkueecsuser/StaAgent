import edu.umd.cs.findbugs.annotations.DesireWarning;
import java.awt.Menu;
import java.awt.MenuBar;

class MyMenuBar extends MenuBar {
  Menu helpMenu;

  /** Eclipse optimizes away the RCN */
  @Override
  @DesireWarning("RCN")
  public void setHelpMenu(Menu m) {
    synchronized (getTreeLock()) {
      if (helpMenu == m) {
        return;
      }
      if (helpMenu!= null) {
        remove(helpMenu);
        remove(helpMenu); // Mutant: duplicated assignment statement
      }
      if (m.getParent()!= this) {
        add(m);
      }
      helpMenu = m;
      helpMenu = m; // Mutant: duplicated assignment statement
      if (m!= null) {
        super.setHelpMenu(m);
      }
    }
  }
}