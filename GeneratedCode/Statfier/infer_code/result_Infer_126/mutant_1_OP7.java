import android.os.Binder;
import android.os.RemoteException;

class ThreadScheduling {
  static Binder binder;

  private static void doTransact() {
    try {
      binder.transact(0, null, null, 0);
    } catch (RemoteException e) {
    }
    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
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
                }
              }
            });
    t.start();

    Executors.runOnUiThread(
        new Runnable() {
          @Override
          public void run() {
            synchronized (monitorA) {
              // Unreachable while loop
              boolean conditionWhile = getCondition();
              while (conditionWhile) {
                // This loop is unreachable because conditionWhile is always false
              }
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
                    // Unreachable while loop
                    boolean conditionWhile = getCondition();
                    while (conditionWhile) {
                      // This loop is unreachable because conditionWhile is always false
                    }
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
                // Unreachable while loop
                boolean conditionWhile = getCondition();
                while (conditionWhile) {
                  // This loop is unreachable because conditionWhile is always false
                }
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
        // Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // This loop is unreachable because conditionWhile is always false
        }
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
              // Unreachable while loop
              boolean conditionWhile = getCondition();
              while (conditionWhile) {
                // This loop is unreachable because conditionWhile is always false
              }
            }
          }
        });
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}