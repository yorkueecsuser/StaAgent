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
      future = future; // Mutant: Duplicate assignment statement
    }
  }

  @UiThread
  Object onUiThreadOpBad() {
    return table.get("blabla");
    // No applicable assignment statement without method invocation to duplicate in this method
  }
}