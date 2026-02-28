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
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case will never be executed because getCondition() does not return true
          System.out.println("This is an unreachable switch case.");
          break;
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

  private boolean getCondition() {
    // This method ensures that the condition is dynamically determined at runtime and always returns false
    return false;
  }
}