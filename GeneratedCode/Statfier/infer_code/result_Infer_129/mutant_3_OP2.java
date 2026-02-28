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
            synchronized (monitorA) { // Mutant: duplicated assignment statement
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
            synchronized (monitorB) { // Mutant: duplicated assignment statement
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
            synchronized (monitorC) { // Mutant: duplicated assignment statement
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
            synchronized (monitorD) { // Mutant: duplicated assignment statement
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
            synchronized (monitorE) { // Mutant: duplicated assignment statement
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
            synchronized (monitorF) { // Mutant: duplicated assignment statement
            }
          }
        });
  }
}