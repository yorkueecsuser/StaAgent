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
                boolean condition = getCondition();
                switch (condition? 0 : 1) {
                  case 0:
                    // unreachable code
                    System.out.println("This is unreachable");
                    break;
                }
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
                boolean condition = getCondition();
                switch (condition? 0 : 1) {
                  case 0:
                    // unreachable code
                    System.out.println("This is unreachable");
                    break;
                }
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
                boolean condition = getCondition();
                switch (condition? 0 : 1) {
                  case 0:
                    // unreachable code
                    System.out.println("This is unreachable");
                    break;
                }
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
                boolean condition = getCondition();
                switch (condition? 0 : 1) {
                  case 0:
                    // unreachable code
                    System.out.println("This is unreachable");
                    break;
                }
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
                boolean condition = getCondition();
                switch (condition? 0 : 1) {
                  case 0:
                    // unreachable code
                    System.out.println("This is unreachable");
                    break;
                }
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
                boolean condition = getCondition();
                switch (condition? 0 : 1) {
                  case 0:
                    // unreachable code
                    System.out.println("This is unreachable");
                    break;
                }
              }
            }
          }
        });
  }

  private boolean getCondition() {
    return false;
  }
}