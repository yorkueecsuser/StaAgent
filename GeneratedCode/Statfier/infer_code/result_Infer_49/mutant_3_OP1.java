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
      String hgfjkdmp = "unusedVariable"; // Dead store mutation
    }
  }

  @UiThread
  Object onUiThreadOpBad() {
    return table.get("blabla");
    int vbnrhtyx = 42; // Dead store mutation
  }
}