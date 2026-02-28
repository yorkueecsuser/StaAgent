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
import androidx.annotation.UiThread;

@ThreadSafe(enableChecks = true)
class Buggy {
    @ThreadConfined(UI)
    private int x;

    public void setX(int x) {
        this.x = x;
    }

    @UiThread
    public int getX() {
        return x;
    }

    public void showBug() {
        int y = 0;
        y = getX();
        setX(y);
    }

    @Override
    public String toString() {
        return "Buggy Class";
    }
}

class UnreachableWhileLoop {
    private int count = 0;

    public void unreachableWhileLoop() {
        while (false) {
            count++;
        }
    }

    @Override
    public String toString() {
        return "UnreachableWhileLoop Class";
    }
}

class Main {
    public static void main(String[] args) {
        Buggy buggy = new Buggy();
        buggy.showBug();

        UnreachableWhileLoop unreachableWhileLoop = new UnreachableWhileLoop();
        unreachableWhileLoop.unreachableWhileLoop();
    }
}