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
        
        // Inserting an unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
          System.out.println("This is an unreachable if statement.");
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

  // Method to provide a dynamically determined condition that is always false
  private boolean getUnreachableCondition() {
    return false;
  }
}