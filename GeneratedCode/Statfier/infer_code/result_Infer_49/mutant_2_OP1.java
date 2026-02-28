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
      // Dead store mutation
      String qzjfnxrm = "unusedVariable";
    }
  }

  @UiThread
  Object onUiThreadOpBad() {
    return table.get("blabla");
    // Dead store mutation
    int vbnrhtyq = 42;
  }
}