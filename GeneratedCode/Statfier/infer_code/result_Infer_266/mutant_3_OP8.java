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


  // Mutated code
  static Executor x;
  static Executor y;

  static Executor getForegroundExecutorMutant() {
    return x;
  }

  static Executor getBackgroundExecutorMutant() {
    return y;
  }

  public static void postOnUiThreadMutant(Runnable z) {}

  public static void postToUiThreadMutant(Runnable a) {}

  public static void runOnUiThreadMutant(Runnable b) {}

  public static void postOnUiThreadDelayedMutant(Runnable c, long d) {}

  public static void scheduleGuaranteedDelayedMutant(
      Runnable e, long f, long g) {}
}