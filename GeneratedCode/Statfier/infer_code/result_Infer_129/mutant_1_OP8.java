import java.util.concurrent.Executor;

class Deadlock {
  // executors are injected and annotated as to what thread they schedule to
  @ForUiThread private final Executor mUiThreadExecutor = null;
  @ForNonUiThread private final Executor mNonUiThreadExecutor = null;

  Object monitorA, monitorB;

  // text-book deadlock between UI and background thread
  public void postDeadlockBad() {
    mUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (monitorA) {
              synchronized (monitorB) {
              }
            }
          }
        });

    mNonUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (monitorB) {
              synchronized (monitorA) {
              }
            }
          }
        });
  }

  Object monitorC, monitorD;

  // non-deadlock as both work items are scheduled on same thread
  public void postOnUIThreadOk() {
    mUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (monitorC) {
              synchronized (monitorD) {
              }
            }
          }
        });

    mUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (monitorD) {
              synchronized (monitorC) {
              }
            }
          }
        });
  }

  Object monitorE, monitorF;

  // deadlock as both work items are scheduled on background threads
  public void postOnBGThreadBad() {
    mNonUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (monitorE) {
              synchronized (monitorF) {
              }
            }
          }
        });

    mNonUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (monitorF) {
              synchronized (monitorE) {
              }
            }
          }
        });
  }

  // Mutated code with renaming
  Object x, y;

  // text-book deadlock between UI and background thread
  public void postDeadlockBadMutant() {
    mUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (x) {
              synchronized (y) {
              }
            }
          }
        });

    mNonUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (y) {
              synchronized (x) {
              }
            }
          }
        });
  }

  Object z, w;

  // non-deadlock as both work items are scheduled on same thread
  public void postOnUIThreadOkMutant() {
    mUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (z) {
              synchronized (w) {
              }
            }
          }
        });

    mUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (w) {
              synchronized (z) {
              }
            }
          }
        });
  }

  Object q, r;

  // deadlock as both work items are scheduled on background threads
  public void postOnBGThreadBadMutant() {
    mNonUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (q) {
              synchronized (r) {
              }
            }
          }
        });

    mNonUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (r) {
              synchronized (q) {
              }
            }
          }
        });
  }
}