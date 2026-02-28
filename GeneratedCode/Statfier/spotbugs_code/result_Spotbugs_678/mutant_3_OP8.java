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
    Menu z = m; // Renamed'm' to 'z'
    if (helpMenu == z) {
      return;
    }
    if (helpMenu!= null) {
      remove(helpMenu);
    }
    if (z.getParent()!= this) {
      add(z);
    }
    helpMenu = z;
    if (z!= null) {
      super.setHelpMenu(z);
    }
  }
}