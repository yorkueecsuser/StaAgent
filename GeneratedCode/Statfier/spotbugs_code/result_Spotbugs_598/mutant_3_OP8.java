import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * A fellow Googler made an excellent point that ignoring to call Future.get() on the returned
 * Future of java.util.concurrent.ExecutorService.submit(...) is as bad as an empty catch clause.
 * Worse even, since it's not quite apparent that this is what you're doing.
 *
 * @author Andy Staudacher
 */
class Ideas_2010_11_23<T> {

  @ExpectWarning("RV_RETURN_VALUE_IGNORED_BAD_PRACTICE")
  public void test(ExecutorService service, Callable<T> callable, Runnable runnable, T value) {
    service.submit(callable);
    service.submit(runnable);
    service.submit(runnable, value);
    
    // Mutated code
    ExecutorService x = service;
    Callable<T> y = callable;
    Runnable z = runnable;
    T w = value;
    x.submit(y);
    x.submit(z);
    x.submit(z, w);
  }

  @ExpectWarning("RV_RETURN_VALUE_IGNORED_BAD_PRACTICE")
  public void test(ThreadPoolExecutor service, Callable<T> callable, Runnable runnable, T value) {
    service.submit(callable);
    service.submit(runnable);
    service.submit(runnable, value);
    
    // Mutated code
    ThreadPoolExecutor a = service;
    Callable<T> b = callable;
    Runnable c = runnable;
    T d = value;
    a.submit(b);
    a.submit(c);
    a.submit(c, d);
  }

  @ExpectWarning("RV_RETURN_VALUE_IGNORED_BAD_PRACTICE")
  public void test(
      ScheduledThreadPoolExecutor service, Callable<T> callable, Runnable runnable, T value) {
    service.submit(callable);
    service.submit(runnable);
    service.submit(runnable, value);
    
    // Mutated code
    ScheduledThreadPoolExecutor e = service;
    Callable<T> f = callable;
    Runnable g = runnable;
    T h = value;
    e.submit(f);
    e.submit(g);
    e.submit(g, h);
  }

  @ExpectWarning("RV_RETURN_VALUE_IGNORED_BAD_PRACTICE")
  public void test(
      AbstractExecutorService service, Callable<T> callable, Runnable runnable, T value) {
    service.submit(callable);
    service.submit(runnable);
    service.submit(runnable, value);
    
    // Mutated code
    AbstractExecutorService i = service;
    Callable<T> j = callable;
    Runnable k = runnable;
    T l = value;
    i.submit(j);
    i.submit(k);
    i.submit(k, l);
  }
}