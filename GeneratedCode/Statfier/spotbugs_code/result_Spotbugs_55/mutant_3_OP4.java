import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.concurrent.ForkJoinPool;

class Issue0076 {

  private static class Handler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should never run
        System.out.println("This should never be printed");
      } else {
        // Alternative code that should also never run
        System.out.println("This should also never be printed");
      }
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined but always false
    }
  }

  @NoWarning("NP_NONNULL_PARAM_VIOLATION")
  public void testNominal() {
    new ForkJoinPool(2, ForkJoinPool.defaultForkJoinWorkerThreadFactory, null, true);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never be printed in testNominal");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never be printed in testNominal");
    }
  }

  @ExpectWarning("NP_NONNULL_PARAM_VIOLATION")
  public void testWarning() {
    new ForkJoinPool(2, null, new Handler(), true);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never be printed in testWarning");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never be printed in testWarning");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}