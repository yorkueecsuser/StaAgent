import java.util.Random;

class FinalizerBug {
    @Override
    public void finalize() {
        // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalizer called");
    }

    public static void showBug() {
        // Mutant code added by Dead Store operator
        Random rand = new Random();
        int deadStoreVariable = rand.nextInt(100);

        FinalizerBug bugObject = new FinalizerBug();
        bugObject = null;
        System.gc();
    }

    public static void main(String[] args) {
        showBug();
    }
}