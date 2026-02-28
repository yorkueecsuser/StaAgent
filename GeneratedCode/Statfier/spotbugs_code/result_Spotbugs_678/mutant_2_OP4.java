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
      // Unreachable if-else statement
      if (condition) {
        // This block is reachable if condition is true
        System.out.println("This is a reachable block.");
      } else {
        // This block is unreachable if condition is false
        System.out.println("This is an unreachable block due to condition being false.");
      }
    }
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime
    return false;
  }
}