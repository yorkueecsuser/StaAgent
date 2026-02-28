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
            boolean shouldRun = getCondition();
            if (shouldRun) {
              synchronized (monitorA) {
                synchronized (monitorB) {
                }
              }
            } else {
              // Unreachable if-else statement
              System.out.println("This is an unreachable else block.");
            }
          }
        });

    mNonUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            boolean shouldRun = getCondition();
            if (shouldRun) {
              synchronized (monitorB) {
                synchronized (monitorA) {
                }
              }
            } else {
              // Unreachable if-else statement
              System.out.println("This is another unreachable else block.");
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
            boolean shouldRun = getCondition();
            if (shouldRun) {
              synchronized (monitorC) {
                synchronized (monitorD) {
                }
              }
            } else {
              // Unreachable if-else statement
              System.out.println("This is yet another unreachable else block.");
            }
          }
        });

    mUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            boolean shouldRun = getCondition();
            if (shouldRun) {
              synchronized (monitorD) {
                synchronized (monitorC) {
                }
              }
            } else {
              // Unreachable if-else statement
              System.out.println("This is one more unreachable else block.");
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
            boolean shouldRun = getCondition();
            if (shouldRun) {
              synchronized (monitorE) {
                synchronized (monitorF) {
                }
              }
            } else {
              // Unreachable if-else statement
              System.out.println("This is an additional unreachable else block.");
            }
          }
        });

    mNonUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            boolean shouldRun = getCondition();
            if (shouldRun) {
              synchronized (monitorF) {
                synchronized (monitorE) {
                }
              }
            } else {
              // Unreachable if-else statement
              System.out.println("This is the last unreachable else block.");
            }
          }
        });
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return true; // This method can be modified to return different values at runtime
  }
}