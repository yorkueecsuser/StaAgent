import java.lang.*;

class FinalizerBug {
    @Override
    public void finalize() {
        // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalizer called");
    }

    // Added mutant code
    private void myMethod() {
        System.out.println("This is a mutant method");
    }

    public static void showBug() {
        FinalizerBug bugObject = new FinalizerBug();
        bugObject.myMethod(); // Calling the mutant method
        bugObject = null;
        System.gc();
    }

    public static void main(String[] args) {
        showBug();
    }
}