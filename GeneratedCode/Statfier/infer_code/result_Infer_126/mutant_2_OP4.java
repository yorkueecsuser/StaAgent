import android.os.Binder;
import android.os.RemoteException;

class ThreadScheduling {
  static Binder binder;

  private static void doTransact() {
    try {
      binder.transact(0, null, null, 0);
    } catch (RemoteException e) {
    }
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
    } else {
      // Some other unreachable code
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
              boolean condition = getCondition();
              if (condition) {
                // Some unreachable code
              } else {
                // Some other unreachable code
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
                    boolean condition = getCondition();
                    if (condition) {
                      // Some unreachable code
                    } else {
                      // Some other unreachable code
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
                boolean condition = getCondition();
                if (condition) {
                  // Some unreachable code
                } else {
                  // Some other unreachable code
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
        boolean condition = getCondition();
        if (condition) {
          // Some unreachable code
        } else {
          // Some other unreachable code
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
              boolean condition = getCondition();
              if (condition) {
                // Some unreachable code
              } else {
                // Some other unreachable code
              }
            }
          }
        });
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}