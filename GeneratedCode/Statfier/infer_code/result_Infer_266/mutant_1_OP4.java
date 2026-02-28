import java.util.concurrent.Executor;

// modeled executors
class Executors {
  static Executor uiExecutor;

  static Executor getForegroundExecutor() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
      return uiExecutor;
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch.");
    }
    return uiExecutor;
  }

  static Executor bgExecutor;

  static Executor getBackgroundExecutor() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
      return bgExecutor;
    } else {
      // Unreachable else branch
      System.out.println("This is another unreachable else branch.");
    }
    return bgExecutor;
  }

  public static void postOnUiThread(Runnable runnable) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
    } else {
      // Unreachable else branch
      System.out.println("Unreachable else branch in postOnUiThread.");
    }
  }

  public static void postToUiThread(Runnable runnable) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
    } else {
      // Unreachable else branch
      System.out.println("Unreachable else branch in postToUiThread.");
    }
  }

  public static void runOnUiThread(Runnable runnable) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
    } else {
      // Unreachable else branch
      System.out.println("Unreachable else branch in runOnUiThread.");
    }
  }

  public static void postOnUiThreadDelayed(Runnable runnable, long delayMs) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
    } else {
      // Unreachable else branch
      System.out.println("Unreachable else branch in postOnUiThreadDelayed.");
    }
  }

  public static void scheduleGuaranteedDelayed(
      Runnable job, long delayMillis, long lastExecution) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
    } else {
      // Unreachable else branch
      System.out.println("Unreachable else branch in scheduleGuaranteedDelayed.");
    }
  }

  private static boolean getCondition() {
    // This method can return true or false dynamically at runtime
    return false;
  }
}