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
        // Introduced unreachable if statement
        boolean condition = getCondition();
        if (condition) {
          System.out.println("This is an unreachable statement.");
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

  // Method to provide a dynamic condition for the if statement
  private boolean getCondition() {
    return false; // This method always returns false, making the if statement unreachable
  }
}