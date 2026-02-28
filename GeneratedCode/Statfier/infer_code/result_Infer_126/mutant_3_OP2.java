import android.os.Binder;
import android.os.RemoteException;

class ThreadScheduling {
  static Binder binder;
  static Binder binderCopy; // Added duplicate assignment

  private static void doTransact() {
    try {
      binder.transact(0, null, null, 0);
    } catch (RemoteException e) {
    }
  }

  Object monitorA;
  Object monitorACopy; // Added duplicate assignment

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
            }
          }
        });
  }

  Object monitorB, monitorC;
  Object monitorBCopy; // Added duplicate assignment

  public void scheduleDeadlockBad() {
    Thread t =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                synchronized (monitorB) {
                  synchronized (monitorC) {
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
              }
            }
          }
        });
  }

  Object monitorD;
  Object monitorDCopy; // Added duplicate assignment

  class BadThread extends Thread {
    @Override
    public void run() {
      synchronized (monitorD) {
        doTransact();
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
            }
          }
        });
  }
}