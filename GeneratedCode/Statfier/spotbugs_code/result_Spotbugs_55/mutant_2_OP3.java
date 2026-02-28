import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.concurrent.ForkJoinPool;

class Issue0076 {

  private static class Handler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {}
  }

  // Method to provide a dynamic condition for the mutant
  private boolean getDynamicCondition() {
    return false; // This method will always return false, but it's not a compile-time constant
  }

  @NoWarning("NP_NONNULL_PARAM_VIOLATION")
  public void testNominal() {
    new ForkJoinPool(2, ForkJoinPool.defaultForkJoinWorkerThreadFactory, null, true);
    
    // Inserting an unreachable if statement
    boolean condition = getDynamicCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in testNominal");
    }
  }

  @ExpectWarning("NP_NONNULL_PARAM_VIOLATION")
  public void testWarning() {
    new ForkJoinPool(2, null, new Handler(), true);
    
    // Inserting an unreachable if statement
    boolean condition = getDynamicCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in testWarning");
    }
  }
}