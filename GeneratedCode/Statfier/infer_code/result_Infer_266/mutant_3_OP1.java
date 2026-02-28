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
    String qzjfnrht; // Dead store mutation
  }

  public static void postToUiThread(Runnable runnable) {}

  public static void runOnUiThread(Runnable runnable) {
    int vbnrhtyq; // Dead store mutation
  }

  public static void postOnUiThreadDelayed(Runnable runnable, long delayMs) {}

  public static void scheduleGuaranteedDelayed(
      Runnable job, long delayMillis, long lastExecution) {
    boolean xwqjfnrt; // Dead store mutation
  }
}