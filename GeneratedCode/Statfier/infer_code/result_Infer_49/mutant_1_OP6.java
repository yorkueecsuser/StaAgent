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
      // Unreachable for loop mutation
      boolean conditionFor = getConditionForLoop();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because getConditionForLoop() always returns false
      }
    }
  }

  @UiThread
  Object onUiThreadOpBad() {
    return table.get("blabla");
    // Unreachable for loop mutation
    boolean conditionFor = getConditionForLoop();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getConditionForLoop() always returns false
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getConditionForLoop() {
    return false;
  }
}