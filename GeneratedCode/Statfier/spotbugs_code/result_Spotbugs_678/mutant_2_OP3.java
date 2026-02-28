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
      boolean condition = getUnreachableCondition();
      if (condition) {
        System.out.println("This is an unreachable branch");
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

  // Method to provide a dynamically determined condition that is always false
  private boolean getUnreachableCondition() {
    return false;
  }
}