import android.os.Binder;
import android.support.annotation.MainThread;

class MainThreadTest {
  Binder b;

  void doTransact() {
    try {
      b.transact(0, null, null, 0);
    } catch (Exception e) {
    }
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() always returns false
    }
  }

  @MainThread
  void callTransactBad() {
    doTransact();
  }

  private boolean getCondition() {
    return false;
  }
}

@MainThread
class AnnotatedClass {
  void callTransactBad(MainThreadTest m) {
    m.doTransact();
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() always returns false
    }
  }

  private boolean getCondition() {
    return false;
  }
}