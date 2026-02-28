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
  }

  @UiThread
  @SuppressLint("someOtherString")
  void onUiThreadBad() throws InterruptedException, ExecutionException {
    future.get();
  }

  @UiThread
  @SuppressLint("starvation")
  void onUiThreadSuppressedMutant() throws InterruptedException, ExecutionException {
    x.get(); // Mutant method using renamed variable
  }

  @UiThread
  @SuppressLint("someOtherString")
  void onUiThreadBadMutant() throws InterruptedException, ExecutionException {
    x.get(); // Mutant method using renamed variable
  }
}

@SuppressLint("STARVATION")
class SuppLintClass {
  Future future;
  Future y; // Mutant variable

  @UiThread
  void onUiThreadSuppressed() throws InterruptedException, ExecutionException {
    future.get();
  }

  @UiThread
  void onUiThreadSuppressedMutant() throws InterruptedException, ExecutionException {
    y.get(); // Mutant method using renamed variable
  }
}