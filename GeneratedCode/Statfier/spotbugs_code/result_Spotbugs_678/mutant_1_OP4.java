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

      // Introduced unreachable if-else statement
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        // This block is unreachable because getUnreachableCondition() always returns false
        System.out.println("This is an unreachable block");
      } else {
        // Alternative unreachable block
        System.out.println("This is another unreachable block");
      }
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, ensuring the if-else block is unreachable
  }
}