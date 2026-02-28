import android.annotation.SuppressLint;
import android.support.annotation.UiThread;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

class SuppLint {
  Future future;
  Future x; // Mutant variable

  @UiThread
  @SuppressLint("starvation")
  void onUiThreadSuppressed() throws InterruptedException, ExecutionException {
    future.get();
    x.get(); // Mutant usage
  }

  @UiThread
  @SuppressLint("someOtherString")
  void onUiThreadBad() throws InterruptedException, ExecutionException {
    future.get();
    x.get(); // Mutant usage
  }
}

@SuppressLint("STARVATION")
class SuppLintClass {
  Future future;
  Future y; // Mutant variable

  @UiThread
  void onUiThreadSuppressed() throws InterruptedException, ExecutionException {
    future.get();
    y.get(); // Mutant usage
  }
}