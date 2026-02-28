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
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
              // Unreachable while loop
            }
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
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
              // Unreachable while loop
            }
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
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
              // Unreachable while loop
            }
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
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
              // Unreachable while loop
            }
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
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
              // Unreachable while loop
            }
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
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
              // Unreachable while loop
            }
            synchronized (monitorF) {
              synchronized (monitorE) {
              }
            }
          }
        });
  }

  private boolean getCondition() {
    return false; // This ensures the loop is unreachable but dynamically determined
  }
}