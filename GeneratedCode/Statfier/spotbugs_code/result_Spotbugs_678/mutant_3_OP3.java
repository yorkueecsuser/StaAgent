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
      // Inserting an unreachable if branch
      boolean alwaysFalse = getAlwaysFalse();
      if (alwaysFalse) {
        System.out.println("This is an unreachable if statement");
      }

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
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}