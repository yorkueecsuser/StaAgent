import android.os.Binder;
import android.os.RemoteException;

class ThreadScheduling {
  static Binder binder;

  private static void doTransact() {
    try {
      binder.transact(0, null, null, 0);
    } catch (RemoteException e) {
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed
        System.out.println("This is an unreachable case");
        break;
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
            }
          }
        });

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed
        System.out.println("This is an unreachable case");
        break;
    }
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

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed
        System.out.println("This is an unreachable case");
        break;
    }
  }

  Object monitorD;

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

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed
        System.out.println("This is an unreachable case");
        break;
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method can be modified to return true/false dynamically
  }
}