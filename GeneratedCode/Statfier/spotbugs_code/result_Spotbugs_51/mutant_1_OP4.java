import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;

class FaultyPublicSemaphore extends Thread {
  public static int objectId = 1;

  public static final int MAX_BASKET_SIZE = 10;

  Set<String> basket = new HashSet<String>();

  public static void main(String[] args) {
    final FaultyPublicSemaphore fps = new FaultyPublicSemaphore();
    Thread t1 =
        new Thread() {
          @Override
          public void run() {
            while (!Thread.interrupted()) {
              try {
                Thread.sleep(1000);
                String s;
                synchronized (fps) {
                  fps.notify(); // this is bad we are screwing up
                  // FPS
                  s = "Apple " + objectId++;
                }
                fps.add(s);
              } catch (InterruptedException ie) {
                return;
              }
            }
            // Inserting unreachable if-else statement
            boolean condition = getCondition();
            if (condition) {
              System.out.println("This is reachable");
            } else {
              System.out.println("This is unreachable");
            }
          }
        };
    t1.start();

    Thread t2 =
        new Thread() {
          @Override
          public void run() {
            while (!Thread.interrupted()) {
              try {
                Thread.sleep(2000);
                String s;
                synchronized (fps) {
                  fps.notify(); // this is bad we are screwing up
                  // FPS
                  s = "Orange " + objectId++;
                }
                fps.add(s);
              } catch (InterruptedException ie) {
                return;
              }
            }
            // Inserting unreachable if-else statement
            boolean condition = getCondition();
            if (condition) {
              System.out.println("This is reachable");
            } else {
              System.out.println("This is unreachable");
            }
          }
        };
    t2.start();

    JOptionPane.showMessageDialog(null, "Quit?");

    try {
      t1.interrupt();
      t2.interrupt();
      t1.join();
      t2.join();
    } catch (Exception e) {
    }
    System.exit(0);
  }

  public FaultyPublicSemaphore() {
    start();
  }

  public synchronized void add(String s) throws InterruptedException {
    while (basket.size() == MAX_BASKET_SIZE) {
      wait();
    }
    basket.add(s);
    if (basket.size() == 1) notify();
    // Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }
  }

  @Override
  public void run() {
    try {
      while (!Thread.interrupted()) {
        String s;
        synchronized (this) {
          while (basket.size() == 0) wait();
          Iterator<String> it = basket.iterator();
          s = it.next();
          it.remove();
          if (basket.size() == (MAX_BASKET_SIZE - 1)) notify();
        }
        System.out.println(s);
        // Inserting unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
          System.out.println("This is reachable");
        } else {
          System.out.println("This is unreachable");
        }
      }
    } catch (InterruptedException ie) {
    }
  }

  private boolean getCondition() {
    return true; // This ensures the condition is always true, making the else branch unreachable
  }
}