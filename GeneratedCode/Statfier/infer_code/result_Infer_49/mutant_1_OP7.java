import android.support.annotation.UiThread;
import java.util.Hashtable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

class LegacySync {
  Hashtable table;
  Future future;

  void notOnUiThreadSyncedBad() throws InterruptedException, ExecutionException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    synchronized (table) {
      future.get();
    }
  }

  @UiThread
  Object onUiThreadOpBad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return table.get("blabla");
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}