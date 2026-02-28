import java.util.concurrent.Executor;

// modeled executors
class Executors {
  static Executor uiExecutor;

  static Executor getForegroundExecutor() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() always returns false
    }
    return uiExecutor;
  }

  static Executor bgExecutor;

  static Executor getBackgroundExecutor() {
    return bgExecutor;
  }

  public static void postOnUiThread(Runnable runnable) {}

  public static void postToUiThread(Runnable runnable) {}

  public static void runOnUiThread(Runnable runnable) {}

  public static void postOnUiThreadDelayed(Runnable runnable, long delayMs) {}

  public static void scheduleGuaranteedDelayed(
      Runnable job, long delayMillis, long lastExecution) {}

  private static boolean getCondition() {
    return false; // Ensure the condition is always false
  }
}