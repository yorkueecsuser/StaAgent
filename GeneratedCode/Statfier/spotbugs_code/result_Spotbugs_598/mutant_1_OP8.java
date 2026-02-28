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
  public void test(ExecutorService a, Callable<T> b, Runnable c, T d) {
    a.submit(b);
    a.submit(c);
    a.submit(c, d);
  }

  @ExpectWarning("RV_RETURN_VALUE_IGNORED_BAD_PRACTICE")
  public void test(ThreadPoolExecutor e, Callable<T> f, Runnable g, T h) {
    e.submit(f);
    e.submit(g);
    e.submit(g, h);
  }

  @ExpectWarning("RV_RETURN_VALUE_IGNORED_BAD_PRACTICE")
  public void test(
      ScheduledThreadPoolExecutor i, Callable<T> j, Runnable k, T l) {
    i.submit(j);
    i.submit(k);
    i.submit(k, l);
  }

  @ExpectWarning("RV_RETURN_VALUE_IGNORED_BAD_PRACTICE")
  public void test(
      AbstractExecutorService m, Callable<T> n, Runnable o, T p) {
    m.submit(n);
    m.submit(o);
    m.submit(o, p);
  }
}