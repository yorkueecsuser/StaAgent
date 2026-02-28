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
      }
      if (m.getParent()!= this) {
        add(m);
      }
      helpMenu = m;
      if (m!= null) {
        super.setHelpMenu(m);
      }
    }

    // Mutated code
    Menu x;
    if (helpMenu == x) {
      return;
    }
    if (x!= null) {
      remove(x);
    }
    if (m.getParent()!= this) {
      add(m);
    }
    x = m;
    if (m!= null) {
      super.setHelpMenu(m);
    }
  }
}