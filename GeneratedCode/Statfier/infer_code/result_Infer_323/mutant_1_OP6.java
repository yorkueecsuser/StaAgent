import android.os.Binder;
import android.support.annotation.MainThread;

class MainThreadTest {
  Binder b;

  void doTransact() {
    try {
      b.transact(0, null, null, 0);
    } catch (Exception e) {
    }
    // Inserting unreachable for loop
    boolean conditionFor = getConditionForLoop();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  private boolean getConditionForLoop() {
    return false;
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
    // Inserting unreachable for loop
    boolean conditionFor = getConditionForLoop();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  private boolean getConditionForLoop() {
    return false;
  }
}