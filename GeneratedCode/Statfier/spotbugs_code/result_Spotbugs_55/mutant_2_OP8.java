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
  }

  @ExpectWarning("NP_NONNULL_PARAM_VIOLATION")
  public void testWarning() {
    new ForkJoinPool(2, null, new Handler(), true);
  }

  // Mutated code
  private static class z implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread x, Throwable y) {}
  }

  @NoWarning("NP_NONNULL_PARAM_VIOLATION")
  public void a() {
    new ForkJoinPool(2, ForkJoinPool.defaultForkJoinWorkerThreadFactory, null, true);
  }

  @ExpectWarning("NP_NONNULL_PARAM_VIOLATION")
  public void b() {
    new ForkJoinPool(2, null, new z(), true);
  }
}