class FinalizerBug {
    @Override
    public void finalize() {
        System.out.println("Finalizer called");
    }

    public static void showBug() {
        FinalizerBug bugObject = new FinalizerBug();
        bugObject = null; // Original assignment statement
        bugObject = null; // Duplicated assignment statement
        System.gc();
    }

    public static void main(String[] args) {
        showBug();
    }
}