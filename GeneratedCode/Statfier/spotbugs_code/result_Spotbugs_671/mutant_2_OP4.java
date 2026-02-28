import java.io.IOException;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

class Mwn {

  static Object[] done = new Object[1];

  static Set hung = new HashSet();

  String address = "localhost";

  public void run() {
    Object result = null;

    try {
      final Socket s = new Socket(address, 12345);
      result = s;
    } catch (final IOException ioe) {
      result = ioe;
    } finally {
      synchronized (hung) {
        hung.remove(address);
        hung.notifyAll();
        
        // Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // This block should never execute
          System.out.println("This is an unreachable if block");
        } else {
          // This block should also never execute
          System.out.println("This is an unreachable else block");
        }
      }
    }

    synchronized (done) {
      done[0] = result;
      done.notifyAll();
    }
  }

  public static final String DOMAINCFG = "Hi";

  boolean b;

  public void falsePositive() throws InterruptedException {
    synchronized (DOMAINCFG) {
      while (!b) DOMAINCFG.wait();
    }
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}