class BuggyFinalizer {
    public void finalize() { // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
    }

    // Unreachable for loop mutant
    public void finalize() {
        for (int i = 0; false; i++) {
            System.out.println("Finalize method called");
        }
    }
}