import android.support.annotation.UiThread;
import java.util.Hashtable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

class LegacySync {
  Hashtable table;
  Future future;

  void notOnUiThreadSyncedBad() throws InterruptedException, ExecutionException {
    synchronized (table) {
      future.get();
    }
  }

  @UiThread
  Object onUiThreadOpBad() {
    return table.get("blabla");
  }

  // Mutated code
  void notOnUiThreadSyncedBadMutant() throws InterruptedException, ExecutionException {
    Hashtable x;
    Future y;
    x = table;
    y = future;
    synchronized (x) {
      y.get();
    }
  }

  @UiThread
  Object onUiThreadOpBadMutant() {
    Hashtable z;
    z = table;
    return z.get("blabla");
  }
}