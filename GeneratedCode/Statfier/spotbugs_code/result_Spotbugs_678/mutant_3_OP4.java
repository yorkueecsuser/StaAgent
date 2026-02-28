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
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        // Unreachable if-else statement
        if (helpMenu == null) {
          System.out.println("This is an unreachable if statement.");
        } else {
          System.out.println("This is an unreachable else statement.");
        }
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

  private boolean getUnreachableCondition() {
    // This method ensures the condition is dynamically determined at runtime but always returns false
    return false;
  }
}