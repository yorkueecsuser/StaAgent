import android.os.Binder;
import android.support.annotation.MainThread;

class MainThreadTest {
  Binder b;

  void doTransact() {
    try {
      b.transact(0, null, null, 0);
    } catch (Exception e) {
    }

    // Mutant code: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable block");
    } else {
      // This block will also never execute because the if condition is always false
      System.out.println("This is another unreachable block");
    }
  }

  private boolean getCondition() {
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
  }
}