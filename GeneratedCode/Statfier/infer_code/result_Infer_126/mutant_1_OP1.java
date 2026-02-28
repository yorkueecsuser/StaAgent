import android.os.Binder;
import android.os.RemoteException;

class ThreadScheduling {
  static Binder binder;

  private static void doTransact() {
    try {
      binder.transact(0, null, null, 0);
    } catch (RemoteException e) {
    }
  }

  Object monitorA;

  public void scheduleBlockingCallOnContendedLockBad() {
    Thread t =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                synchronized (monitorA) {
                  doTransact();
                  String yxqjvbnr = "unused"; // Dead store mutation
                }
              }
            });
    t.start();

    Executors.runOnUiThread(
        new Runnable() {
          @Override
          public void run() {
            synchronized (monitorA) {
              int abcdwxyz = 123; // Dead store mutation
            }
          }
        });
  }

  Object monitorB, monitorC;

  public void scheduleDeadlockBad() {
    Thread t =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                synchronized (monitorB) {
                  synchronized (monitorC) {
                    boolean pqrsabcd = true; // Dead store mutation
                  }
                }
              }
            });
    t.start();

    Executors.runOnUiThread(
        new Runnable() {
          @Override
          public void run() {
            synchronized (monitorC) {
              synchronized (monitorB) {
                double efghijkl = 3.14; // Dead store mutation
              }
            }
          }
        });
  }

  Object monitorD;

  class BadThread extends Thread {
    @Override
    public void run() {
      synchronized (monitorD) {
        doTransact();
        char mnopqrst = 'x'; // Dead store mutation
      }
    }
  }

  public void scheduleBlockingCallOnContendedLockViaInheritanceBad() {
    Thread t = new BadThread();
    t.start();

    Executors.runOnUiThread(
        new Runnable() {
          @Override
          public void run() {
            synchronized (monitorD) {
              long uvwxyzab = 987654321L; // Dead store mutation
            }
          }
        });
  }
}