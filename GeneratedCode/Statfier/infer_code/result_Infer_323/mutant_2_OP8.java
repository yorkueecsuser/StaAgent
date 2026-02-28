import android.os.Binder;
import android.support.annotation.MainThread;

class MainThreadTest {
  Binder b;

  void doTransact() {
    try {
      b.transact(0, null, null, 0);
    } catch (Exception e) {
    }
  }

  @MainThread
  void callTransactBad() {
    doTransact();
  }

  // Mutant code
  Binder c;
}

@MainThread
class AnnotatedClass {
  void callTransactBad(MainThreadTest m) {
    m.doTransact();
  }

  // Mutant code
  void callTransactGood(AnnotatedClass a) {
    a.callTransactBad(new MainThreadTest());
  }
}