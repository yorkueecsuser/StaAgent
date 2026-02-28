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
            // Mutant: Duplicate of the assignment statement
            arr.add("done_duplicate");
          }
        };
    SwingUtilities.invokeLater(r);
  }
}