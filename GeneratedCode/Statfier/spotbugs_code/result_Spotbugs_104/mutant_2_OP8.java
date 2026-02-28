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
          }
        };
    SwingUtilities.invokeLater(r);

    // Mutated code
    final ArrayList brr = new ArrayList();
    Runnable s =
        new Runnable() {
          @Override
          public void run() {
            brr.add("done");
          }
        };
    SwingUtilities.invokeLater(s);
  }
}