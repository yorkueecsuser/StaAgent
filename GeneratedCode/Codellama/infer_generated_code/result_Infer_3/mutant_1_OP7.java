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

// Mutant 1: Insert unreachable while loop into the showBug method
public static void showBug() {
    A a = new A();
    B b = new B();
    a.uiThreadMethod(); // This method call is annotated with @UiThread, which is not allowed to call a method annotated with @WorkerThread.
    while (false) {
        System.out.println("This code is unreachable");
    }
}

// Mutant 2: Insert unreachable for loop into the showBug method
public static void showBug() {
    A a = new A();
    B b = new B();
    a.uiThreadMethod(); // This method call is annotated with @UiThread, which is not allowed to call a method annotated with @WorkerThread.
    for (int i = 0; false; i++) {
        System.out.println("This code is unreachable");
    }
}

// Mutant 3: Insert unreachable if statement into the showBug method
public static void showBug() {
    A a = new A();
    B b = new B();
    a.uiThreadMethod(); // This method call is annotated with @UiThread, which is not allowed to call a method annotated with @WorkerThread.
    if (false) {
        System.out.println("This code is unreachable");
    }
}

// Mutant 4: Insert unreachable if-else statement into the showBug method
public static void showBug() {
    A a = new A();
    B b = new B();
    a.uiThreadMethod(); // This method call is annotated with @UiThread, which is not allowed to call a method annotated with @WorkerThread.
    if (false) {
        System.out.println("This code is unreachable");
    } else {
        System.out.println("This code is unreachable");
    }
}

// Mutant 5: Insert unreachable switch statement into the showBug method
public static void showBug() {
    A a = new A();
    B b = new B();
    a.uiThreadMethod(); // This method call is annotated with @UiThread, which is not allowed to call a method annotated with @WorkerThread.
    switch (0) {
        case 1:
            System.out.println("This code is unreachable");
            break;
    }
}