import java.util.concurrent.Executor;

// modeled executors
class Executors {
  static Executor uiExecutor;

  static Executor getForegroundExecutor() {
    return uiExecutor;
  }

  static Executor bgExecutor;

  static Executor getBackgroundExecutor() {
    return bgExecutor;
  }

  public static void postOnUiThread(Runnable runnable) {
    // Introducing an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case");
        break;
    }
  }

  public static void postToUiThread(Runnable runnable) {}

  public static void runOnUiThread(Runnable runnable) {}

  public static void postOnUiThreadDelayed(Runnable runnable, long delayMs) {}

  public static void scheduleGuaranteedDelayed(
      Runnable job, long delayMillis, long lastExecution) {}

  private static boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime
    return false;
  }
}