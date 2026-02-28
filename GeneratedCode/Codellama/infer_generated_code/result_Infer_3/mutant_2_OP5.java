import com.facebook.infer.annotation.ThreadSafe;
import com.facebook.infer.annotation.ThreadConfined;
import com.facebook.infer.annotation.SuppressLint;

@ThreadSafe
class A {
    @UiThread
    public static void uiThreadMethod() {}
}

@ThreadConfined
class B {
    @WorkerThread
    public static void workerThreadMethod() {}
}

class Main {
    @SuppressLint("BUG_TYPE")
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.uiThreadMethod();
        b.workerThreadMethod();
    }

    // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    public static void showBug() {
        A a = new A();
        B b = new B();
        a.uiThreadMethod(); // This method call is annotated with @UiThread, which is not allowed to call a method annotated with @WorkerThread.
    }
}

// Mutant code: Unreachable switch statement
public static void showBug() {
    A a = new A();
    B b = new B();
    a.uiThreadMethod(); // This method call is annotated with @UiThread, which is not allowed to call a method annotated with @WorkerThread.
    switch (0) { // This switch statement is unreachable and will never be executed
        case 1: // This case statement is unreachable and will never be executed
            b.workerThreadMethod(); // This method call is annotated with @WorkerThread, which is not allowed to call a method annotated with @UiThread.
            break;
    }
}