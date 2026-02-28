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
            // Dead store mutation
            String abcdefgh = "unusedVariable";
          }
        };
    SwingUtilities.invokeLater(r);
  }
}