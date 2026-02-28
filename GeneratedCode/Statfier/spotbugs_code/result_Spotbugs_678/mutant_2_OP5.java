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

      // Introduced unreachable switch statement
      boolean condition = getUnreachableCondition();
      switch (condition) {
        case true:
          // This case is unreachable because getUnreachableCondition() always returns false
          System.out.println("This is an unreachable case.");
          break;
        default:
          // Default case
          break;
      }
    }
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}