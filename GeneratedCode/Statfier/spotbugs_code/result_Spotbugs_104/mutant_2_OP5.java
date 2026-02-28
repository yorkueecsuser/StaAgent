import java.util.ArrayList;
import javax.swing.SwingUtilities;

class Bug3031977 {

  public void m() {
    final ArrayList arr = new ArrayList();
    Runnable r =
        new Runnable() {
          @Override
          public void run() {
            arr.add("done");

            // Introduced unreachable switch statement
            boolean condition = getCondition();
            switch (condition? 0 : 1) {
              case 0:
                // This case is unreachable because condition is always false
                arr.add("unreachable");
                break;
              case 1:
                // This is the only reachable case
                break;
            }
          }
        };
    SwingUtilities.invokeLater(r);
  }

  private boolean getCondition() {
    return false;
  }
}