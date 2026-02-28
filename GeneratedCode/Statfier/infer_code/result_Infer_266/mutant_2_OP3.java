import java.util.concurrent.Executor;

// modeled executors
class Executors {
  static Executor uiExecutor;

  static Executor getForegroundExecutor() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    return uiExecutor;
  }

  static Executor bgExecutor;

  static Executor getBackgroundExecutor() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is another unreachable statement.");
    }
    return bgExecutor;
  }

  public static void postOnUiThread(Runnable runnable) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("Unreachable in postOnUiThread.");
    }
  }

  public static void postToUiThread(Runnable runnable) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("Unreachable in postToUiThread.");
    }
  }

  public static void runOnUiThread(Runnable runnable) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("Unreachable in runOnUiThread.");
    }
  }

  public static void postOnUiThreadDelayed(Runnable runnable, long delayMs) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("Unreachable in postOnUiThreadDelayed.");
    }
  }

  public static void scheduleGuaranteedDelayed(
      Runnable job, long delayMillis, long lastExecution) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("Unreachable in scheduleGuaranteedDelayed.");
    }
  }

  private static boolean getCondition() {
    // This method should return a condition that is always false at runtime
    return false;
  }
}