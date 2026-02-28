import com.facebook.infer.annotation.ThreadSafe;
import com.facebook.infer.annotation.ThreadConfined;
import com.facebook.infer.annotation.Expensive;
import com.facebook.infer.annotation.PerformanceCritical;
import com.facebook.infer.annotation.ReturnsOwnership;
import com.facebook.infer.annotation.NoAllocation;
import com.facebook.infer.annotation.Lockless;
import com.facebook.infer.annotation.SynchronizedCollection;
import com.facebook.infer.annotation.FalseOnNull;
import com.facebook.infer.annotation.TrueOnNull;
import com.facebook.infer.annotation.Present;
import com.facebook.infer.annotation.Initializer;
import com.facebook.infer.annotation.SuppressReturnOverAnnotated;
import com.facebook.infer.annotation.SuppressLint;
import com.facebook.infer.annotation.Mutable;
import com.facebook.infer.annotation.NonBlocking;
import com.facebook.infer.annotation.VisibleForTesting;
import com.facebook.infer.annotation.Functional;
import com.facebook.infer.annotation.UiThread;

@ThreadSafe(enableChecks = true)
class Buggy {
    @ThreadConfined(UI)
    private int a;

    public void setA(int a) {
        this.a = a;
    }

    @UiThread
    public int getA() {
        return a;
    }

    public void showBug() {
        int b = 0;
        b = getA();
        setA(b);
    }
}