import android.os.Binder;
import android.support.annotation.MainThread;

class MainThreadTest {
  Binder b;

  void doTransact() {
    try {
      b.transact(0, null, null, 0);
    } catch (Exception e) {
    }
    // Mutant code start
    boolean condition = getCondition();
    if (condition) {
      // This block is intended to be unreachable
      System.out.println("This is an unreachable if statement");
    }
    // Mutant code end
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }

  @MainThread
  void callTransactBad() {
    doTransact();
  }
}

@MainThread
class AnnotatedClass {
  void callTransactBad(MainThreadTest m) {
    m.doTransact();
  }
}