import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.concurrent.ForkJoinPool;

class Issue0076 {

  private static class Handler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {}
  }

  @NoWarning("NP_NONNULL_PARAM_VIOLATION")
  public void testNominal() {
    new ForkJoinPool(2, ForkJoinPool.defaultForkJoinWorkerThreadFactory, null, true);
    
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never be printed");
        break;
    }
  }

  @ExpectWarning("NP_NONNULL_PARAM_VIOLATION")
  public void testWarning() {
    new ForkJoinPool(2, null, new Handler(), true);
    
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never be printed");
        break;
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}