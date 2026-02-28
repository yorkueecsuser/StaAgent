import android.os.Binder;
import android.support.annotation.MainThread;

class MainThreadTest {
  Binder b;

  void doTransact() {
    try {
      b.transact(0, null, null, 0);
      // Dead Store Mutation
      String qzjfnxwb = "unusedVariable";
    } catch (Exception e) {
    }
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
    // Dead Store Mutation
    int kxmtvbnr = 42;
  }
}