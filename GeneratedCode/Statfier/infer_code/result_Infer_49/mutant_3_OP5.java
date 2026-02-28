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
      
      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is never true
          System.out.println("This is an unreachable case");
          break;
        case 1:
          // This is the reachable case
          break;
      }
    }
  }

  @UiThread
  Object onUiThreadOpBad() {
    return table.get("blabla");
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will ensure the switch case remains unreachable
  }
}