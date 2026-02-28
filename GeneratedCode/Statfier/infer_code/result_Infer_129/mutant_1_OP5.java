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
            boolean condition = getCondition();
            switch(condition) {
              case true:
                // unreachable code
                System.out.println("This is unreachable");
                break;
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
            boolean condition = getCondition();
            switch(condition) {
              case true:
                // unreachable code
                System.out.println("This is unreachable");
                break;
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
            boolean condition = getCondition();
            switch(condition) {
              case true:
                // unreachable code
                System.out.println("This is unreachable");
                break;
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
            boolean condition = getCondition();
            switch(condition) {
              case true:
                // unreachable code
                System.out.println("This is unreachable");
                break;
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
            boolean condition = getCondition();
            switch(condition) {
              case true:
                // unreachable code
                System.out.println("This is unreachable");
                break;
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
            boolean condition = getCondition();
            switch(condition) {
              case true:
                // unreachable code
                System.out.println("This is unreachable");
                break;
            }
            synchronized (monitorF) {
              synchronized (monitorE) {
              }
            }
          }
        });
  }

  private boolean getCondition() {
    return false;
  }
}