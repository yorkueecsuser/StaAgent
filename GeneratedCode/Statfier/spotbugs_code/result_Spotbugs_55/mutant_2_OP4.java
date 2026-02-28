import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.concurrent.ForkJoinPool;

class Issue0076 {

  private static class Handler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {}
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }

  @NoWarning("NP_NONNULL_PARAM_VIOLATION")
  public void testNominal() {
    new ForkJoinPool(2, ForkJoinPool.defaultForkJoinWorkerThreadFactory, null, true);
    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable code");
    } else {
      System.out.println("This is unreachable code due to getCondition() always returning false");
    }
  }

  @ExpectWarning("NP_NONNULL_PARAM_VIOLATION")
  public void testWarning() {
    new ForkJoinPool(2, null, new Handler(), true);
    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable code");
    } else {
      System.out.println("This is unreachable code due to getCondition() always returning false");
    }
  }
}