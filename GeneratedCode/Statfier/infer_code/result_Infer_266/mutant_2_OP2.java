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

  public static void postOnUiThread(Runnable runnable) {}

  public static void postToUiThread(Runnable runnable) {}

  public static void runOnUiThread(Runnable runnable) {}

  public static void postOnUiThreadDelayed(Runnable runnable, long delayMs) {}

  public static void scheduleGuaranteedDelayed(
      Runnable job, long delayMillis, long lastExecution) {}
  
  // Mutated code starts here
  static {
    uiExecutor = null; // Original assignment
    uiExecutor = null; // Duplicated assignment

    bgExecutor = null; // Original assignment
    bgExecutor = null; // Duplicated assignment
  }
}