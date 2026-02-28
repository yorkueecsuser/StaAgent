class FinalizerBug {
    @Override
    public void finalize() {
        // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalizer called");
    }

    public static void showBug() {
        FinalizerBug bugObject = new FinalizerBug();
        bugObject = null;
        System.gc();
    }

    public static void main(String[] args) {
        showBug();

        // MUTATION: Introduce a do-while loop that does not affect the finalize() method
        int i = 0;
        do {
            System.out.println("Do-while loop iteration: " + i);
            i++;
        } while (i < 3);
    }
}