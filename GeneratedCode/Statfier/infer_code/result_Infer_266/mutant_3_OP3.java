import java.util.concurrent.Executor;

// modeled executors
class Executors {
  static Executor uiExecutor;

  static Executor getForegroundExecutor() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      if (isUnreachable()) {
        System.out.println("This is an unreachable statement.");
      }
    }
    return uiExecutor;
  }

  static Executor bgExecutor;

  static Executor getBackgroundExecutor() {
    return bgExecutor;
  }

  public static void postOnUiThread(Runnable runnable) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      if (isUnreachable()) {
        System.out.println("This is another unreachable statement.");
      }
    }
  }

  public static void postToUiThread(Runnable runnable) {}

  public static void runOnUiThread(Runnable runnable) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      if (isUnreachable()) {
        System.out.println("Yet another unreachable statement.");
      }
    }
  }

  public static void postOnUiThreadDelayed(Runnable runnable, long delayMs) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      if (isUnreachable()) {
        System.out.println("One more unreachable statement.");
      }
    }
  }

  public static void scheduleGuaranteedDelayed(
      Runnable job, long delayMillis, long lastExecution) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      if (isUnreachable()) {
        System.out.println("And yet another unreachable statement.");
      }
    }
  }

  private static boolean getCondition() {
    return true; // This method can return any dynamic condition
  }

  private static boolean isUnreachable() {
    return false; // This method ensures the if statement is unreachable
  }
}