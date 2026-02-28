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

// Mutant 1: Duplication of assignment statement
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

// Mutant 2: Duplication of assignment statement
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

// Mutant 3: Duplication of assignment statement
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

// Mutant 4: Duplication of assignment statement
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

// Mutant 5: Duplication of assignment statement
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