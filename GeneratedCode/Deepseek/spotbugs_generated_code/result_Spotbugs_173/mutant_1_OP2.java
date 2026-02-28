class FinalizerBug {
    @Override
    public void finalize() {
        System.out.println("Finalizer called");
        // Mutant code added below
        System.out.println("Finalizer called - duplicate statement");
    }

    public static void showBug() {
        FinalizerBug bugObject = new FinalizerBug();
        // Mutant code added below (duplicated assignment)
        bugObject = new FinalizerBug();
        bugObject = null;
        System.gc();
    }

    public static void main(String[] args) {
        showBug();
    }
}