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
      // Mutant: Inserting unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
        table.put("key", "value");
      } else {
        // This block will always execute
        table.put("key", "anotherValue");
      }
    }
  }

  @UiThread
  Object onUiThreadOpBad() {
    return table.get("blabla");
    // Mutant: Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      return new Object();
    } else {
      // This block will always execute
      return table.get("defaultKey");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}