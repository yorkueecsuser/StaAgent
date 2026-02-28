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

// Mutation Operator: Unreachable switch statement
// Description: Inserting unreachable switch statement into a randomly selected basic block in the program. The switch condition must always evaluate to false to make it unreachable.

// Mutant 1: Insert switch statement with constant condition
class Mutant1 {
    @SuppressLint("BUG_TYPE")
    public static void showBug() {
        A a = new A();
        B b = new B();
        a.uiThreadMethod(); // This method call is annotated with @UiThread, which is not allowed to call a method annotated with @WorkerThread.
        switch (false) {
            case 0:
                b.workerThreadMethod();
                break;
        }
    }
}

// Mutant 2: Insert switch statement with non-final variable condition
class Mutant2 {
    @SuppressLint("BUG_TYPE")
    public static void showBug() {
        A a = new A();
        B b = new B();
        boolean condition = false;
        a.uiThreadMethod(); // This method call is annotated with @UiThread, which is not allowed to call a method annotated with @WorkerThread.
        switch (condition) {
            case true:
                b.workerThreadMethod();
                break;
        }
    }
}

// Mutant 3: Insert switch statement with non-final method call condition
class Mutant3 {
    @SuppressLint("BUG_TYPE")
    public static void showBug() {
        A a = new A();
        B b = new B();
        boolean condition = getCondition();
        a.uiThreadMethod(); // This method call is annotated with @UiThread, which is not allowed to call a method annotated with @WorkerThread.
        switch (condition) {
            case true:
                b.workerThreadMethod();
                break;
        }
    }

    public static boolean getCondition() {
        return false;
    }
}