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
      // Mutant code added here
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
        table.put("key", "value");
      } else {
        // Alternative code that will also never execute due to the same reason
        table.remove("key");
      }
    }
  }

  @UiThread
  Object onUiThreadOpBad() {
    return table.get("blabla");
    // Mutant code added here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      return new Object();
    } else {
      // Alternative code that will also never execute due to the same reason
      return null;
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}