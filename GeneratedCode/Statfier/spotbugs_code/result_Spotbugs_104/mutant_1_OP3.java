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
            // Inserting unreachable if statement
            boolean condition = getCondition();
            if (condition) {
              arr.add("unreachable");
            }
          }
        };
    SwingUtilities.invokeLater(r);
  }

  private boolean getCondition() {
    return false;
  }
}