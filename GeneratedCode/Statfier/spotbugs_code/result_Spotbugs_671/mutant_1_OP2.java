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
      result = s; // Mutant: Duplicate assignment
    } catch (final IOException ioe) {
      result = ioe;
      result = ioe; // Mutant: Duplicate assignment
    } finally {
      synchronized (hung) {
        hung.remove(address);
        hung.notifyAll();
        hung.remove(address); // Mutant: Duplicate assignment
      }
    }

    synchronized (done) {
      done[0] = result;
      done[0] = result; // Mutant: Duplicate assignment
      done.notifyAll();
    }
  }

  public static final String DOMAINCFG = "Hi";

  boolean b;

  public void falsePositive() throws InterruptedException {
    synchronized (DOMAINCFG) {
      while (!b) DOMAINCFG.wait();
      while (!b) DOMAINCFG.wait(); // Mutant: Duplicate assignment
    }
  }
}